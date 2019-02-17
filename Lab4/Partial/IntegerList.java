import java.nio.BufferOverflowException;


public class IntegerList implements IntegerListInterface {
	private int dataList[];
	private int index=-1;
	private IntegerList()
	{
		// do nothing
	}
	
	public IntegerList(int c) throws IllegalArgumentException {
		if ( c < 0 ) throw new IllegalArgumentException();
		
		dataList = new int[c];
		
	}
	@Override
	public void add(int atIndex, int element) throws IndexOutOfBoundsException,BufferOverflowException {
		
		if( size() == dataList.length )
			throw new BufferOverflowException();
		
		if ( (atIndex <= (size()-1)) && ( size() < (dataList.length)) && (size() > 0)) {			
			
			for(int i=(size()-1);i >= atIndex;i--) {
				dataList[i+1] = dataList[i];			
			}
			dataList[atIndex] = element;
			index++;
		}
		else {
			
			throw new IndexOutOfBoundsException();
		
		}
		
		
	}

	@Override
	public void add(int element) throws BufferOverflowException {
		if ( size() < dataList.length ) {
			index++;
			dataList[index] = element;
		}
		else {
			
			throw new BufferOverflowException();
			
		}
			
	}

	@Override
	public void clear() {
		index = -1;		
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int remove(int atIndex) throws IndexOutOfBoundsException  {
		
		if (atIndex <= (size()-1) && atIndex >= 0 ) {
			
			int element = dataList[atIndex];
			
			for(int i=atIndex+1;i<=index;i++) {
				dataList[i-1] = dataList[i];			
			}
			index--;
			
			return element;
		}
		else {
			
			throw new IndexOutOfBoundsException();
			
		}
		
	
	}

	@Override
	public void removeRange(int fromIndex, int toIndex) throws IndexOutOfBoundsException,IllegalArgumentException {
			
		
	}

	@Override
	public void set(int atIndex, int element) throws IndexOutOfBoundsException {
		
		if (atIndex <= (size()-1) && atIndex >= 0 ) {
			
			dataList[atIndex] = element;

		}
		else {
			
			throw new IndexOutOfBoundsException();
			
		}		
		
	}
	@Override
	public int get(int atIndex) throws IndexOutOfBoundsException {
		
		if (atIndex <= (size()-1) && atIndex >= 0 ) {
			
			return dataList[atIndex];

		}
		else {
			
			throw new IndexOutOfBoundsException();
			
		}			
	}


	@Override
	public int size() {
		return (index+1);
	}
	

}
