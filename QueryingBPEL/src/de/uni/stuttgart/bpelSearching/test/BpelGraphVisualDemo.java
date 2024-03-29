package de.uni.stuttgart.bpelSearching.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JFrame;

import org.apache.log4j.Logger;
import org.jgraph.JGraph;
import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;

import de.uni.stuttgart.bpelSearching.GraphMapping.nodes.ActivityNode;


public class BpelGraphVisualDemo extends JApplet{

	//~ Static fields/initializers ---------------------------------------------

    private static final long serialVersionUID = 3256444702936019250L;
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FAFBFF");
    private static final Dimension DEFAULT_SIZE = new Dimension(600, 700);

	static Logger logger = Logger.getLogger(GraphBuildTest.class);
	
//	private ListenableGraph<String, DefaultEdge> processGraphDemo = new ListenableDirectedGraph<String, DefaultEdge>(DefaultEdge.class);	
	private ListenableGraph<ActivityNode, DefaultEdge> processGraphDemo = new ListenableDirectedGraph<ActivityNode, DefaultEdge>(DefaultEdge.class);
	
//	private JGraphModelAdapter<String, DefaultEdge> jgAdapter;
	private JGraphModelAdapter<ActivityNode, DefaultEdge> jgAdapter;
    
    
    /**
     * An alternative starting point for this demo, to also allow running this
     * applet as an application.
     *
     * @param args ignored.
     */

    public static void main(String [] args)
    {
    	BpelGraphVisualDemo applet = new BpelGraphVisualDemo();
        applet.init();

        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("JGraphT Adapter to JGraph Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
	public void init()
    {   	
    // create a visualization using JGraph, via an adapter
//    jgAdapter = new JGraphModelAdapter<String, DefaultEdge>(getProcessGraphDemo());
      jgAdapter = new JGraphModelAdapter<ActivityNode, DefaultEdge>(getProcessGraphDemo());

      JGraph jgraph = new JGraph(jgAdapter);
    
      // parameters for calculation of vertex's position
	  int i = 0;
	  int j = 0;  
	  int averageB = 1;
	  int averageL = 1;
    
      adjustDisplaySettings(jgraph);
      getContentPane().add(jgraph);
      resize(DEFAULT_SIZE);
    
      // ************** Process Graph Demo *************************
//	  DatabaseConfiguration dbConfig = DbGraphPropertiesFactory.getInstance()
//	  .getDBConfiguration();   
//      final SessionFactory sessionFactory = dbConfig.getSessionFactory();
//	  final Session session = sessionFactory.openSession();
//
//	  // start Transaction
//	  session.beginTransaction();
//	  Query query = session.createQuery("FROM Process p WHERE p.name like 'Swi%' ");
//	  List<Process> processes = query.list();
//	  logger.warn("list length:" + processes.size());
//
//	  Process process = processes.get(0);
//	  ProcessGraphFactory1 graphFactory = new StructuredProcessGraphFactory1(
//			process);	
//	  ProcessGraph graph = graphFactory.createProcessFlowGraph(process);
//	
//	  session.getTransaction().commit();
//	  session.close();
//		// create demo graph	
//		Set<ActivityNode> vertexSet = graph.getGraph().vertexSet();	
//		for (ActivityNode vertex : vertexSet) {		
////			getProcessGraphDemo().addVertex(vertex.getActivityName() + ": " + vertex.getActivityID());	
//			getProcessGraphDemo().addVertex(vertex);
//			logger.warn("query node: " + vertex.toString());
//		}
//		
//		Set<DefaultEdge> edgeSet = graph.getGraph().edgeSet();
//		for (DefaultEdge edge : edgeSet) {
////			String source = graph.getProcessGraph().getEdgeSource(edge).getActivityName() + ": " + graph.getProcessGraph().getEdgeSource(edge).getActivityID();
////			String target = graph.getProcessGraph().getEdgeTarget(edge).getActivityName() + ": " + graph.getProcessGraph().getEdgeTarget(edge).getActivityID();
////			getProcessGraphDemo().addEdge(source, target);
//			ActivityNode source = graph.getGraph().getEdgeSource(edge);
//			ActivityNode target = graph.getGraph().getEdgeTarget(edge);
//			getProcessGraphDemo().addEdge(source, target);
//		}
////		 String startNode = graph.getStartActivity().getActivityName() + ": " + graph.getStartActivity().getActivityID();
//		 DepthFirstTraverseExtension dft = new DepthFirstTraverseExtension(graph.getGraph(), graph.getStartActivity());		
//		 dft.traverse();
//		 
////		 Map<ActivityNode, Integer> lMap = dft.getLevelMap();
////		 Map<ActivityNode, Integer> preMap = dft.getPreorderMap();
////		 Map<ActivityNode, Integer> postMap = dft.getPostorderMap();
////		 for (ActivityNode vertex : vertexSet) {		
////			 System.out.println("vertex: " + vertex  + "  level: " + lMap.get(vertex) 
////				  + "  preorder: " + preMap.get(vertex)  + "  postorder: " + postMap.get(vertex));
////		 }
//		averageB = 600/(dft.getMaxBreadth() + 1);
//		averageL = 700/(dft.getMaxLevel() + 1);
////		System.out.println("maxBreadth: " + dft.getMaxBreadth()  + "  maxLevel: " + dft.getMaxLevel() 
////				+ "  averageB: " + averageB  + "  averageL: " + averageL);			
////		Set<String> vertexSetGraphDemo = getProcessGraphDemo().vertexSet();
//		Set<ActivityNode> vertexSetGraphDemo = getProcessGraphDemo().vertexSet();
//		for (ActivityNode vertexGraphDemo: vertexSetGraphDemo){		
//			i = dft.getVertexBreadth(vertexGraphDemo);
//			j = dft.getVertexLevel(vertexGraphDemo);	
//			i = i*averageB + 30;
//			j = j*averageL + 20;				
//			positionVertexAt(vertexGraphDemo, i, j); 		
//		 }
				
      // ************** Query Graph Demo *************************
//      Process process;
//      String startID;
//      ActivityNode startNode = new ActivityNode("", "", 0);
//      ProcessUtilsNormal processUtils = new ProcessUtilsNormal();
//      File BPELdir = new File("BPELFiles/QueryFile");
//      File[] fileArray = BPELdir.listFiles();
//      for (int i1 = 0; i1 < fileArray.length; i1++) {
//		File fileTemp = fileArray[i1];
//		if (!fileTemp.isDirectory() && fileTemp.getName().equals("Switch.bpel")) {
//			logger.warn("Query TestCase: " + fileTemp.getPath());
//			process = processUtils.loadProcessFromFile(fileTemp);
//			QueryGraphFactory1 graphFactory = DbGraphPropertiesFactory
//					.getInstance().getQueryGraphFactory();
//			DirectedGraph<ActivityNode, DefaultEdge> qGraph = 
//						graphFactory.createGraphFromProcess(process);
//			startID = graphFactory.getStartActivityID();
//			
//			// create demo graph	
//			Set<ActivityNode> vertexSet = qGraph.vertexSet();
//			startNode = vertexSet.iterator().next();	
//			for (ActivityNode vertex : vertexSet) {		
//				getProcessGraphDemo().addVertex(vertex);
//				if (vertex.getActivityID().compareTo(startID) == 0) {
//					startNode = vertex;		
//				}
//				logger.warn("query node: " + vertex.toString());
//			}
//			
//			Set<DefaultEdge> edgeSet = qGraph.edgeSet();
//			for (DefaultEdge edge : edgeSet) {
//				ActivityNode source = qGraph.getEdgeSource(edge);
//				ActivityNode target = qGraph.getEdgeTarget(edge);
//				getProcessGraphDemo().addEdge(source, target);
//			}
//			
//			// get the start node
//			logger.warn("startNode: " + startNode.toString());
//			logger.warn("startNode ID: " + startID);
//			DepthFirstTraverseExtension dft = new DepthFirstTraverseExtension(qGraph, startNode);		
//			dft.traverse();
//					
//			averageB = 600/(dft.getMaxBreadth() + 1);
//			averageL = 700/(dft.getMaxLevel() + 1);
//			Set<ActivityNode> vertexSetGraphDemo = getProcessGraphDemo().vertexSet();
//			for (ActivityNode vertexGraphDemo: vertexSetGraphDemo){		
//				i = dft.getVertexBreadth(vertexGraphDemo);
//				j = dft.getVertexLevel(vertexGraphDemo);	
//				i = i*averageB + 30;
//				j = j*averageL + 20;				
//				positionVertexAt(vertexGraphDemo, i, j); 		
//			 }
//			break;
//		}
//      }
    }
    
    private void adjustDisplaySettings(JGraph jg)
    {
        jg.setPreferredSize(DEFAULT_SIZE);

        Color c = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter("bgcolor");
        } catch (Exception e) {
        }

        if (colorStr != null) {
            c = Color.decode(colorStr);
        }

        jg.setBackground(c);
    }

    @SuppressWarnings("unchecked") // FIXME hb 28-nov-05: See FIXME below
    private void positionVertexAt(Object vertex, int x, int y)
    {
        DefaultGraphCell cell = jgAdapter.getVertexCell(vertex);
        if(cell == null)
        	System.out.println("After DefaultGraphCell, cell is null  " );
        AttributeMap attr = cell.getAttributes();
        //System.out.println("AttributeMap attr  " + attr.toString());
        Rectangle2D bounds = GraphConstants.getBounds(attr);
        //System.out.println("bounds.getWidth()     " + bounds.getWidth()+ "bounds.getHeight()     " + bounds.getHeight() );

        Rectangle2D newBounds =
            new Rectangle2D.Double(
                x,
                y,
                bounds.getWidth(),
                bounds.getHeight());

        GraphConstants.setBounds(attr, newBounds);

        // TODO: Clean up generics once JGraph goes generic
        AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        jgAdapter.edit(cellAttr, null, null, null);
    }



//	public ListenableGraph<String, DefaultEdge> getProcessGraphDemo() {
//		return processGraphDemo;
//	}
//
//	public void setProcessGraphDemo(
//			ListenableGraph<String, DefaultEdge> processGraphDemo) {
//		this.processGraphDemo = processGraphDemo;
//	}




    //~ Inner Classes ----------------------------------------------------------

    /**
     * a listenable directed multigraph that allows loops and parallel edges.
     */
    /*
    private static class ListenableDirectedMultigraph<V, E>
        extends DefaultListenableGraph<V, E>
        implements DirectedGraph<V, E>
    {
        private static final long serialVersionUID = 1L;

        ListenableDirectedMultigraph(Class<E> edgeClass)
        {
            super(new DirectedMultigraph<V, E>(edgeClass));
        }
    } 
    */
	
//    BreadthFirstIteratorNew1<String, DefaultEdge> createIterator(
//    		ListenableGraph<String, DefaultEdge> g,
//            String vertex)
//        {
//            BreadthFirstIteratorNew1<String, DefaultEdge> i =
//                new BreadthFirstIteratorNew1<String, DefaultEdge>(g, vertex);
//            i.setCrossComponentTraversal(true);
//
//            return i;
//        }
    
    public ListenableGraph<ActivityNode, DefaultEdge> getProcessGraphDemo() {
		return processGraphDemo;
	}



	public void setProcessGraphDemo(
			ListenableGraph<ActivityNode, DefaultEdge> processGraphDemo) {
		this.processGraphDemo = processGraphDemo;
	}
    
}
