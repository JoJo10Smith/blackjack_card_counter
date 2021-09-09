def get_stats(player_total,card_count):
  total_cards = 0
  card_under_21 = 0
  card_equal_21 = 0
  card_over_21 = 0
  
  for current_card in card_count:
    total_cards += card_count[current_card]
    if player_total + current_card < 21:
      card_under_21 += card_count[current_card]
    elif player_total + current_card > 21:
      card_over_21 += card_count[current_card]
    else:
      card_equal_21 += card_count[current_card]

  #print the stats
  print ("Under count: {}".format(card_under_21/total_cards))
  print ("Exact count: {}".format(card_equal_21/total_cards))
  print ("Over count: {} \n".format(card_over_21/total_cards))
  

def update_deck(player_count,next_card):
  global card_count
  if card_count[next_card] == 1:
    return False
  else:
    if player_count + next_card > 21:
      return False
    card_count[next_card] -= 1
    return True

GAME_ON = True
card_count = {}

for i in range(1,12):
  card_count[i] = 4
  
player_count = 0
dealer_count = 0

while GAME_ON:  
  player_next = input("Next card for player {}: ".format(player_count))
  player_count += int(player_next)
  GAME_ON = update_deck(player_count,int(player_next))
  get_stats(player_count,card_count)
  
  dealer_next = input("Next card for dealer {}: ".format(dealer_count))
  dealer_count += int(dealer_next)
  GAME_ON = update_deck(dealer_count,int(dealer_next))
  get_stats(dealer_count,card_count)
  
  
  
