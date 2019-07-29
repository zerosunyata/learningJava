
public class NodeBuilder {

	private Node node = new Node();
	
	public NodeBuilder setData(String data) {
		node.setData(data);
		return this;
	}
	
	public NodeBuilder setNext(Node next) {
		node.setNext(next);
		return this;
	}
	
	public Node build() {
		return this.node;
	}
}
