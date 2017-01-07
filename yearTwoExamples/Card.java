import java.util.*;
class Card
{
	private String suit, rank;
	
	public Card(String suit, String rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString()
	{
		String s = rank + " of " + suit;
		return s;
	}
}

class Deck
{
	private Card[] cards;
	
	public Deck()
	{	
		cards = new Card[52];
		
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight",
						"Nine","Ten","Jack","Queen","King"};
						
		for(int i = 0; i < suits.length; i++)
		{
			for(int j = 0; j < ranks.length; j++)
			{
				int k = i * ranks.length + j;
				cards[k] = new Card(suits[i], ranks[j]);
			}
		}
	}
	
	public Card[] getCards()
	{
		return cards;
	}
}

class Dealer
{
	private Deck d;
	private Card[] cards;
	private int cardIndex;
	
	public Dealer()
	{
		d = new Deck();
		cards = d.getCards();
		cardIndex = 0;
	}
	
	public void showCards()
	{
		for(int i = 0; i < cards.length; i++)
			System.out.println(i + " " + cards[i]);
			
	}
	
	public void shuffle()
	{
		int n = cards.length;
		Random rand = new Random();
		rand.nextInt();
		for(int i = 0; i < n; i++)
		{
			int change = i + rand.nextInt(n - i);
			swap(i, change);
		}
	}
	
	public void swap(int i, int change)
	{
		Card temp = cards[i];
		cards[i] = cards[change];
		cards[change] = temp;
	}
	
	public void deal(int n)
	{
		System.out.println(cardIndex);
		for(int i = cardIndex; i < cardIndex + n; i++)
		{
			System.out.println(cards[i]);
		}
		cardIndex = cardIndex + n;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Dealer sunshine = new Dealer();
		sunshine.showCards();
		sunshine.shuffle();
		System.out.println("-----------------------------------------------");
		sunshine.showCards();
		sunshine.deal(10);
		sunshine.deal(5);
		
	}
}