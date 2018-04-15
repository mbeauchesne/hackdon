package ca.hackdon.pirate;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

public class RandomDataService {

	public List<String> familyPosition = Arrays.asList("ma fille", "mon père", "mon voisin", "ma mère", "ma maman", "mon enfant", "mon bébé");

	public List<String> careName = Arrays.asList("Radiograhie", "Projet de recherche sur le Cancer", "Chambre hyperbare", "Du nouveau mobilier");

	public Faker faker = new Faker();

	public Date currentDate = new Date();

	public long generateLong(long leftLimit, long rightLimit) {
		return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
	}

	public Donor createDonor() {
		Donor donor = new Donor(
					faker.name().firstName(),
					generateLong(1,5),
					"Je donner pour " + familyPosition.get((int)(Math.random()*familyPosition.size())),
					"Fondation du CHUS",
					LocalDateTime.from(currentDate.toInstant()).minusHours(generateLong(0, 9000)),
					LocalDateTime.from(currentDate.toInstant()).minusHours(generateLong(0, 9000))
				);
		return donor;
	}

	public CareService createCareService() {
		CareService careService = new CareService(
				careName.get((int)(Math.random()*careName.size())),
				generateLong(0, 10000),
				generateLong(100000, 1000000),
				generateLong(100000, 1000000),
				generateLong(100, 1000));
		return careService;
	}

}
