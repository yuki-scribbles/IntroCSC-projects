using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace goFish.ViewModels {

    abstract class GameHandler{
        protected int numPlayers;
        protected int maxHandCards;
        protected Player[] players;
        protected CardDeck DrawingPile;
        protected CardDeck? DiscardPile;

        public abstract void startGame();
        public abstract void transferCardTo(CardDeck firstDeck, CardDeck secondDeck);


    }

    public class Player {
        public CardDeck hand;
        //can be money or just points based
        public int points;
        public int maxCards = 5;
        public Boolean active = true;
        public Player(int maxCards) {
            this.points = 0;
            this.maxCards = maxCards;
            this.hand = new CardDeck(maxCards);
        }
        public void outGame() {
            active = false;
        }
    }
    public class CardDeck{
        //in case you have restriction like how many cards are in a hand
        protected int? maxCards;
        protected List<Cards> deck;
        public CardDeck(List<Cards> deck) {
            this.deck = deck;
        }
        public CardDeck(int maxCards) {
            this.deck = new List<Cards>{ };
            this.maxCards = maxCards;
        }
        public CardDeck(List<Cards> deck, int maxCards) {
            this.deck = deck;
            this.maxCards = maxCards;
        }

        //Will take away cards from another stack of cards like a drawing deck or taking another players card
        public void TakeCardsAtTop(List<Cards> otherDeck, int numCards){
        
        }

        public void AddCards(List<Cards> otherDeck){
        }
        //overide + operator to make adding a card a bit easier?
        
    }
    public class Cards {
        public enum Suits {
            Diamond,
            Heart,
            Club,
            Spade
        }
        public enum Ranks {
            joker,
            ace,
            two,
            three,
            four,
            five,
            six,
            seven,
            eight,
            nine,
            ten,
            jack,
            queen,
            king,
        }
        private readonly Suits suit;
        private readonly Ranks rank;
        public Suits Suit {
            get { return this.suit; }
        }
        public Ranks Rank {
            get { return this.rank; }
        }

        public Cards(int rank,int suit) {
            this.rank = (Ranks) rank;
            this.suit = (Suits) suit;
        }
    }
}
