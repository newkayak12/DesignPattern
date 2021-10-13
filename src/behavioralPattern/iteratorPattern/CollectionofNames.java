package behavioralPattern.iteratorPattern;

public class CollectionofNames implements Container{
	public String name[] ={"Kim", "Lee", "Son", "Hwang", "Jang", "Park"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionofNamesIterate();
	}

	private class CollectionofNamesIterate implements Iterator{
		int i;
		@Override
		public boolean hasNext() {
			if(i<name.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return name[i++];
			}
			return null;
		}

	}
	
}
