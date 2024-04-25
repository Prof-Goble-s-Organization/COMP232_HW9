

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * An Adjacency List implementation of the Graph ADT for undirected graphs.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version April 23, 2024
 * 
 * @param <V>
 *            the type of object associated with the vertices.
 * @param <E>
 *            the type of object associated with the edges.
 */
public class DirectedAdjacencyListGraph<V, E> extends AbstractGraph<V, E> {

	/*
	 * Holds the list of edges leaving each vertex. So, index v contains a list
	 * of the edges for which v is the start index.
	 */
	protected LinkedList<Edge<E>>[] edgeLists;

	/**
	 * Construct a new AdjacencyListGraph with the specified number of vertices.
	 * 
	 * @param numVertices
	 *            the number of vertices in the graph.
	 */
	@SuppressWarnings("unchecked")
	public DirectedAdjacencyListGraph(int numVertices) {
		super(numVertices);

		edgeLists = (LinkedList<Edge<E>>[]) new LinkedList<?>[numVertices];
		for (int i = 0; i < edgeLists.length; i++) {
			edgeLists[i] = new LinkedList<Edge<E>>();
		}
	}

	/*
	 * Helper method that gets the Edge object associated with an edge
	 */
	private Edge<E> getEdgeObject(int v1, int v2) {
		// use an iterator to search the list of edges for v1
		LinkedList<Edge<E>> list = edgeLists[v1];
		Iterator<Edge<E>> itr = list.iterator();
		while(itr.hasNext()) {
			Edge<E> edge = itr.next();
			if (edge.equals(new Edge<E>(v1, v2, null))) {
				// found it
				return edge;
			}
		}

		// Edge is not in the graph
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public void addEdge(int v1, int v2, E value) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * {@inheritDoc}
	 */
	public E getEdge(int v1, int v2) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * {@inheritDoc}
	 */
	public E removeEdge(int v1, int v2) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * {@inheritDoc}
	 */
	public ArrayList<Integer> getNeighbors(int v) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Get the in degree of vertex v.
	 * 
	 * @param v
	 *            the vertex of which to compute the in degree.
	 * @return the in degree of vertex v.
	 */
	public int inDegree(int v) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Class used to hold the information about each edge in the graph.
	 */
	protected static class Edge<E> {
		public E edgeObject;
		public int startVertex; // not strictly necessary, but seems nice.
		public int endVertex;

		public Edge(int sv, int ev, E obj) {
			edgeObject = obj;
			startVertex = sv;
			endVertex = ev;
		}

		/*
		 * Check if two edges are equal in a directed graph.
		 */
		public boolean equals(Edge<E> e) {
			return (startVertex == e.startVertex && endVertex == e.endVertex);
		}
	}
}