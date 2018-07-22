package com.assignment.animal.behavior.implementation;

import java.util.HashMap;
import java.util.Map;

import com.assignment.animal.behavior.MultiLangSing;
import com.assignment.animal.behavior.Sing;

public class RoosterSoundImpl implements Sing, MultiLangSing {

	private String message = "Cock-a-doodle-doo...";
	private Map<String, String> languageMap = new HashMap<String, String>();

	public RoosterSoundImpl() {
		languageMap.put("Danish", "kykyliky");
		languageMap.put("Dutch", "kukeleku");
		languageMap.put("Finnish", "kukko kiekuu");
		languageMap.put("French", "cocorico");
		languageMap.put("German", "kikeriki");
		languageMap.put("Greek", "kikiriki");
		languageMap.put("Hebrew", "coo-koo-ri-koo");
		languageMap.put("Hungarian", "kukuriku");
		languageMap.put("Italian", "chicchirichi");
		languageMap.put("Japanese", "ko-ke-kok-ko-o");
		languageMap.put("Portuguese", "cucurucu");
		languageMap.put("Russian", "kukareku");
		languageMap.put("Swedish", "kuckeliku");
		languageMap.put("Turkish", "kuk-kurri-kuuu");
		languageMap.put("Urdu", "kuklooku");
	}

	public String sing() {
		System.out.println(message);
		return message;
	}

	@Override
	public String sing(String language) {
		String message = "I do not speak " + language;
		if (null != language && languageMap.containsKey(language)) {
			System.out.println(language + ": " + languageMap.get(language));
			return language + ": " + languageMap.get(language);
		} else {
			System.out.println(message);
			return message;
		}
	}
}
