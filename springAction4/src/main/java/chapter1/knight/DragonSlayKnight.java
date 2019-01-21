package chapter1.knight;

public class DragonSlayKnight implements BraveKnight {

	private Quest quest;

	public DragonSlayKnight(Quest quest) {
		// TODO Auto-generated constructor stub

		this.quest = quest;
	}

	@Override
	public void embakOnQuest() {
		// TODO Auto-generated method stub

		quest.embark();
	}

}
