public class kStackArray
{
	static class kStacks
	{
		int arr[];
    int top[];
		int next[];
		int n, k;
		int free;

		kStacks(int k1, int n1)
		{
			k = k1;
			n = n1;
			arr = new int[n];
			top = new int[k];
			next = new int[n];

			for (int i = 0; i < k; i++)
				top[i] = -1;

			free = 0;
			for (int i = 0; i < n - 1; i++){
			     next[i] = i + 1;
      }
			next[n - 1] = -1;
		}

		boolean isFull()
		{
			return (free == -1);
		}

		static void push(int item, int sn)
		{
			if (isFull())
			{
				System.out.println("Stack Overflow");
				return;
			}

			int i = free;

			free = next[i];

			next[i] = top[sn];
			top[sn] = i;

			arr[i] = item;
		}

		int pop(int sn)
		{
			if (isEmpty(sn))
			{
				System.out.println("Stack Underflow");
				return Integer.MAX_VALUE;
			}

			int i = top[sn];

			top[sn] = next[i];
			next[i] = free;
			free = i;

			return arr[i];
		}

		boolean isEmpty(int sn)
		{
			return (top[sn] == -1);
		}

	}

	public static void main(String[] args)
	{
		int k = 3, n = 10;

		kStacks kStack = new kStacks(k, n);

		kStack.push(15, 2);
		kStack.push(45, 2);

		kStack.push(17, 1);
		kStack.push(49, 1);
		kStacks.push(39, 1);

		kStack.push(11, 0);
		kStack.push(9, 0);
		kStack.push(7, 0);

		System.out.println("Popped element from stack 2 is " + kStack.pop(2));
		System.out.println("Popped element from stack 1 is " + kStack.pop(1));
		System.out.println("Popped element from stack 0 is " + kStack.pop(0));
	}
}
