$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/ressources/features/adresse.feature");
formatter.feature({
  "name": "Modifier l\u0027adresse d\u0027un abonné",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Modification de l\u0027adresse d\u0027un abonné résident en France sans ou avec date d\u0027effet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "un abonné avec une adresse principale \"\u003cactive\u003e\" en \"\u003cpays\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "le conseiller connecté à \"\u003ccanal\u003e\" modifie adresse de abonné \"\u003ccondition\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "adresse de l\u0027abonné modifiée est enregistrée sur ensemble des contrats de abonné",
  "keyword": "Then "
});
formatter.step({
  "name": "un mouvement de modification de adresse est créé",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "canal",
        "active",
        "pays",
        "condition"
      ]
    },
    {
      "cells": [
        "FACE",
        "inactive",
        "France",
        "sans date d\u0027effet"
      ]
    },
    {
      "cells": [
        "EC",
        "active",
        "Pologne",
        "avec date d\u0027effet"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Modification de l\u0027adresse d\u0027un abonné résident en France sans ou avec date d\u0027effet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "un abonné avec une adresse principale \"inactive\" en \"France\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AbonneStep.un_abonné_avec_une_adresse_principales_inactive_en_France(String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.AbonneStep.un_abonné_avec_une_adresse_principales_inactive_en_France(AbonneStep.java:25)\r\n\tat ✽.un abonné avec une adresse principale \"inactive\" en \"France\"(file:src/test/ressources/features/adresse.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "le conseiller connecté à \"FACE\" modifie adresse de abonné \"sans date d\u0027effet\"",
  "keyword": "When "
});
formatter.match({
  "location": "ModifAdresseStep.le_conseiller_connecté_à_modifie_adresse_de_abonné(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "adresse de l\u0027abonné modifiée est enregistrée sur ensemble des contrats de abonné",
  "keyword": "Then "
});
formatter.match({
  "location": "ModifAdresseStep.adresse_de_l_abonné_modifiée_est_enregistrée_sur_ensemble_des_contrats_de_abonné()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "un mouvement de modification de adresse est créé",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Modification de l\u0027adresse d\u0027un abonné résident en France sans ou avec date d\u0027effet",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "un abonné avec une adresse principale \"active\" en \"Pologne\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AbonneStep.un_abonné_avec_une_adresse_principales_inactive_en_France(String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.AbonneStep.un_abonné_avec_une_adresse_principales_inactive_en_France(AbonneStep.java:25)\r\n\tat ✽.un abonné avec une adresse principale \"active\" en \"Pologne\"(file:src/test/ressources/features/adresse.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "le conseiller connecté à \"EC\" modifie adresse de abonné \"avec date d\u0027effet\"",
  "keyword": "When "
});
formatter.match({
  "location": "ModifAdresseStep.le_conseiller_connecté_à_modifie_adresse_de_abonné(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "adresse de l\u0027abonné modifiée est enregistrée sur ensemble des contrats de abonné",
  "keyword": "Then "
});
formatter.match({
  "location": "ModifAdresseStep.adresse_de_l_abonné_modifiée_est_enregistrée_sur_ensemble_des_contrats_de_abonné()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "un mouvement de modification de adresse est créé",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});