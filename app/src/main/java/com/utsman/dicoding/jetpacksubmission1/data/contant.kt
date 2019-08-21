package com.utsman.dicoding.jetpacksubmission1.data

import android.net.Uri
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide

fun logi(msg: String?) = Log.i("UTSMAN", msg)
fun loge(msg: String?) = Log.e("UTSMAN", msg)

fun ImageView.loadWithGlide(url: String) =
        Glide.with(this.context).load(Uri.parse("file:///android_asset/$url")).centerCrop().into(this)

const val MOVIES = "movies"
const val SHOWS = "shows"

const val moviesData = "[\n" +
        "  {\n" +
        "    \"id\": \"01\",\n" +
        "    \"title\": \"A Star is Born\",\n" +
        "    \"year\": \"2018\",\n" +
        "    \"release_date\": \"February 19, 2019\",\n" +
        "    \"score\": 7.5,\n" +
        "    \"poster\": \"movies/poster_a_start_is_born.jpg\",\n" +
        "    \"overview\": \"Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, romance, music\",\n" +
        "    \"runtime\": \"2h 15m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Lady Gaga\",\n" +
        "        \"character\": \"Ally Campana\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Bradley Cooper\",\n" +
        "        \"character\": \"Jackson Maine\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Sam Elliott\",\n" +
        "        \"character\": \"Bobby Maine\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"02\",\n" +
        "    \"title\": \"Alita: Battle Angel\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"July 23, 2019\",\n" +
        "    \"score\": 6.8,\n" +
        "    \"poster\": \"movies/poster_alita.jpg\",\n" +
        "    \"overview\": \"When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"action, science fiction, thriller, adventure\",\n" +
        "    \"runtime\": \"2h 2m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Rosa Salazar\",\n" +
        "        \"character\": \"Alita / 99\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Christoph Waltz\",\n" +
        "        \"character\": \"Dr. Dyson Ido\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Jennifer Connelly\",\n" +
        "        \"character\": \"Dr. Chiren\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"03\",\n" +
        "    \"title\": \"Aquaman\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"March 26, 2019\",\n" +
        "    \"score\": 6.8,\n" +
        "    \"poster\": \"movies/poster_aquaman.jpg\",\n" +
        "    \"overview\": \"Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"action, adventure, fantasy\",\n" +
        "    \"runtime\": \"2h 24m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Jason Momoa\",\n" +
        "        \"character\": \"Arthur Curry / Aquaman\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Amber Heard\",\n" +
        "        \"character\": \"Mera\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Willem Dafoe\",\n" +
        "        \"character\": \"Nuidis Vulko\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"04\",\n" +
        "    \"title\": \"Bohemian Rhapsody\",\n" +
        "    \"year\": \"2018\",\n" +
        "    \"release_date\": \"October 30, 2018\",\n" +
        "    \"score\": 8.1,\n" +
        "    \"poster\": \"movies/poster_bohemian.jpg\",\n" +
        "    \"overview\": \"Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, music\",\n" +
        "    \"runtime\": \"2h 15m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Rami Malek\",\n" +
        "        \"character\": \"Freddie Mercury\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Gwilym Lee\",\n" +
        "        \"character\": \"Brian May\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Ben Hardy\",\n" +
        "        \"character\": \"Roger Taylor\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"05\",\n" +
        "    \"title\": \"Cold Pursuit\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"February 8, 2019\",\n" +
        "    \"score\": 5.4,\n" +
        "    \"poster\": \"movies/poster_cold_persuit.jpg\",\n" +
        "    \"overview\": \"The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"action, drama, thriller, crime\",\n" +
        "    \"runtime\": \"1h 59m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Liam Neeson\",\n" +
        "        \"character\": \"Nels Coxman\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Laura Dern\",\n" +
        "        \"character\": \"Grace Coxman\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Tom Bateman\",\n" +
        "        \"character\": \"Trevor 'Viking' Calcote\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"06\",\n" +
        "    \"title\": \"Creed\",\n" +
        "    \"year\": \"2015\",\n" +
        "    \"release_date\": \"November 25, 2015\",\n" +
        "    \"score\": 7.3,\n" +
        "    \"poster\": \"movies/poster_creed.jpg\",\n" +
        "    \"overview\": \"The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama\",\n" +
        "    \"runtime\": \"2h 13m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Michael B. Jordan\",\n" +
        "        \"character\": \"Adonis Creed\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Sylvester Stallone\",\n" +
        "        \"character\": \"Robert 'Rocky' Balboa Sr.\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Tessa Thompson\",\n" +
        "        \"character\": \"Bianca Taylor\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"07\",\n" +
        "    \"title\": \"Fantastic Beasts: The Crimes of Grindelwald\",\n" +
        "    \"year\": \"2018\",\n" +
        "    \"release_date\": \"November 16, 2018\",\n" +
        "    \"score\": 7.3,\n" +
        "    \"poster\": \"movies/poster_crimes.jpg\",\n" +
        "    \"overview\": \"Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"adventure\",\n" +
        "    \"runtime\": \"2h 14m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Eddie Redmayne\",\n" +
        "        \"character\": \"Newt Scamander\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Katherine Waterston\",\n" +
        "        \"character\": \"Porpentina 'Tina' Goldstein\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Alison Sudol\",\n" +
        "        \"character\": \"Queenie Goldstein\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"08\",\n" +
        "    \"title\": \"Glass\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"January 18, 2019\",\n" +
        "    \"score\": 6.5,\n" +
        "    \"poster\": \"movies/poster_glass.jpg\",\n" +
        "    \"overview\": \"In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"thriller, drama, science fiction\",\n" +
        "    \"runtime\": \"2h 9m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"James McAvoy\",\n" +
        "        \"character\": \"Patricia / Dennis / Hedwig / The Beast / Barry / Heinrich / Jade / Ian / Mary Reynolds / Norma / Jalin / Kat / B.T. / Kevin Wendell Crumb / Mr. Pritchard / Felida / Luke / Goddard / Samuel / Polly\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Bruce Willis\",\n" +
        "        \"character\": \"David Dunn / The Overseer\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Anya Taylor-Joy\",\n" +
        "        \"character\": \"Casey Cooke\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"09\",\n" +
        "    \"title\": \"How to Train Your Dragon\",\n" +
        "    \"year\": \"2010\",\n" +
        "    \"release_date\": \"March 26, 2010\",\n" +
        "    \"score\": 7.7,\n" +
        "    \"poster\": \"movies/poster_how_to_train.jpg\",\n" +
        "    \"overview\": \"As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"fantasy, adventure, animation, family\",\n" +
        "    \"runtime\": \"1h 40m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Jay Baruchel\",\n" +
        "        \"character\": \"Hiccup Horrendous Haddock III (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Gerard Butler\",\n" +
        "        \"character\": \"Stoick the Vast (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Craig Ferguson\",\n" +
        "        \"character\": \"Gobber the Belch (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"10\",\n" +
        "    \"title\": \"Avengers: Infinity War\",\n" +
        "    \"year\": \"2018\",\n" +
        "    \"release_date\": \"April 23, 2018\",\n" +
        "    \"score\": 8.8,\n" +
        "    \"poster\": \"movies/poster_infinity_war.jpg\",\n" +
        "    \"overview\": \"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"adventure, action, science fiction\",\n" +
        "    \"runtime\": \"2h 29m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Robert Downey Jr.\",\n" +
        "        \"character\": \"Tony Stark / Iron Man\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Chris Hemsworth\",\n" +
        "        \"character\": \"Thor Odinson\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Chris Evans\",\n" +
        "        \"character\": \"Steve Rogers / Captain America\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"11\",\n" +
        "    \"title\": \"Mary Queen of Scots\",\n" +
        "    \"year\": \"2018\",\n" +
        "    \"release_date\": \"November 15, 2018\",\n" +
        "    \"score\": 6.6,\n" +
        "    \"poster\": \"movies/poster_marry_queen.jpg\",\n" +
        "    \"overview\": \"In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, history\",\n" +
        "    \"runtime\": \"2h 4m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Saoirse Ronan\",\n" +
        "        \"character\": \"Mary Stuart\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Margot Robbie\",\n" +
        "        \"character\": \"Queen Elizabeth I\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Jack Lowden\",\n" +
        "        \"character\": \"Lord Darnley\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  }\n" +
        "]"


const val showsData = "[\n" +
        "  {\n" +
        "    \"id\": \"11\",\n" +
        "    \"title\": \"Arrow\",\n" +
        "    \"year\": \"2012\",\n" +
        "    \"release_date\": \"October 10, 2012\",\n" +
        "    \"score\": 5.8,\n" +
        "    \"poster\": \"tv_shows/poster_arrow.jpg\",\n" +
        "    \"overview\": \"Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, romance, crime, action\",\n" +
        "    \"runtime\": \"42m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Stephen Amell\",\n" +
        "        \"character\": \"Oliver Queen\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"David Ramsey\",\n" +
        "        \"character\": \"John Diggle / Spartan\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Katie Cassidy\",\n" +
        "        \"character\": \"Black Canary\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"12\",\n" +
        "    \"title\": \"Doom Patrol\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"July 23, 2019\",\n" +
        "    \"score\": 6.2,\n" +
        "    \"poster\": \"tv_shows/poster_doom_patrol.jpg\",\n" +
        "    \"overview\": \"The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"action, science fiction, adventure\",\n" +
        "    \"runtime\": \"60m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Timothy Dalton\",\n" +
        "        \"character\": \"Dr. Niles Caulder / The Chief\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Matt Bomer\",\n" +
        "        \"character\": \"Negative Man (voice) / Larry Trainor\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Brendan Fraser\",\n" +
        "        \"character\": \"Robotman (voice) / Cliff Steele\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"13\",\n" +
        "    \"title\": \"Dragon Ball\",\n" +
        "    \"year\": \"1986\",\n" +
        "    \"release_date\": \"February 26, 1986\",\n" +
        "    \"score\": 7.0,\n" +
        "    \"poster\": \"tv_shows/poster_dragon_ball.jpg\",\n" +
        "    \"overview\": \"Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure.\",\n" +
        "    \"lang\": \"Japan\",\n" +
        "    \"genre\": \"comedy, action, adventure, fantasy\",\n" +
        "    \"runtime\": \"25m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Masako Nozawa\",\n" +
        "        \"character\": \"Son Goku (voice)\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Mayumi Tanaka\",\n" +
        "        \"character\": \"Krillin (voice)\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Hiromi Tsuru\",\n" +
        "        \"character\": \"Bulma (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"14\",\n" +
        "    \"title\": \"Fairy Tail\",\n" +
        "    \"year\": \"2009\",\n" +
        "    \"release_date\": \"October 12, 2009\",\n" +
        "    \"score\": 6.4,\n" +
        "    \"poster\": \"tv_shows/poster_fairytail.jpg\",\n" +
        "    \"overview\": \"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.\",\n" +
        "    \"lang\": \"Japan\",\n" +
        "    \"genre\": \"comedy, action, adventure, fantasy\",\n" +
        "    \"runtime\": \"25m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Tetsuya Kakihara\",\n" +
        "        \"character\": \"Natsu Dragneel (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Aya Hirano\",\n" +
        "        \"character\": \"Lucy Heartfilia (voice)\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Rie Kugimiya\",\n" +
        "        \"character\": \"Happy (voice)\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"15\",\n" +
        "    \"title\": \"Family Guy\",\n" +
        "    \"year\": \"1999\",\n" +
        "    \"release_date\": \"January 31, 1999\",\n" +
        "    \"score\": 6.5,\n" +
        "    \"poster\": \"tv_shows/poster_family_guy.jpg\",\n" +
        "    \"overview\": \"Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"animation, comedy\",\n" +
        "    \"runtime\": \"22m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Seth MacFarlane\",\n" +
        "        \"character\": \"Peter Griffin / Brian Griffin / Stewie Griffin / Glenn Quagmire / Tom Tucker / God / Kool-Aid Guy (voice)\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Alex Borstein\",\n" +
        "        \"character\": \"Marguerite Pewterschmidt, Lois Griffin (voice), Tricia Takanawa, Loretta Brown, Barbara Pewterschmidt\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Mila Kunis\",\n" +
        "        \"character\": \"Mila Kunis\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"16\",\n" +
        "    \"title\": \"The Flash\",\n" +
        "    \"year\": \"2014\",\n" +
        "    \"release_date\": \"October 7, 2014\",\n" +
        "    \"score\": 6.6,\n" +
        "    \"poster\": \"tv_shows/poster_flash.jpg\",\n" +
        "    \"overview\": \"After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, science-fiction\",\n" +
        "    \"runtime\": \"44m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Grant Gustin\",\n" +
        "        \"character\": \"Barry Allen / The Flash\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Candice Patton\",\n" +
        "        \"character\": \"Iris West\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Carlos Valdes\",\n" +
        "        \"character\": \"Cisco Ramon, Reverb\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"17\",\n" +
        "    \"title\": \"Gotham\",\n" +
        "    \"year\": \"2014\",\n" +
        "    \"release_date\": \"September 22, 2014\",\n" +
        "    \"score\": 6.8,\n" +
        "    \"poster\": \"tv_shows/poster_gotham.jpg\",\n" +
        "    \"overview\": \"Before there was Batman, there was GOTHAM. Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama, fantacy, crime\",\n" +
        "    \"runtime\": \"43m, 60m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Ben McKenzie\",\n" +
        "        \"character\": \"James 'Jim' Gordon\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Donal Logue\",\n" +
        "        \"character\": \"Harvey Bullock\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"David Mazouz\",\n" +
        "        \"character\": \"Bruce Wayne / 514A / Batman\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"18\",\n" +
        "    \"title\": \"Grey's Anatomy\",\n" +
        "    \"year\": \"2005\",\n" +
        "    \"release_date\": \"March 27, 2005\",\n" +
        "    \"score\": 6.3,\n" +
        "    \"poster\": \"tv_shows/poster_grey_anatomy.jpg\",\n" +
        "    \"overview\": \"Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"drama\",\n" +
        "    \"runtime\": \"43m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Ellen Pompeo\",\n" +
        "        \"character\": \"Meredith Grey\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Justin Chambers\",\n" +
        "        \"character\": \"Alex Karev\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"James Pickens Jr.\",\n" +
        "        \"character\": \"Richard Webber\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"19\",\n" +
        "    \"title\": \"Hanna\",\n" +
        "    \"year\": \"2019\",\n" +
        "    \"release_date\": \"March 28, 2019\",\n" +
        "    \"score\": 6.5,\n" +
        "    \"poster\": \"tv_shows/poster_hanna.jpg\",\n" +
        "    \"overview\": \"This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"action-adventure, drama\",\n" +
        "    \"runtime\": \"50m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Esme Creed-Miles\",\n" +
        "        \"character\": \"Hanna\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Joel Kinnaman\",\n" +
        "        \"character\": \"Erik\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Mireille Enos\",\n" +
        "        \"character\": \"Marrisa\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"20\",\n" +
        "    \"title\": \"Marvel's Iron Fist\",\n" +
        "    \"year\": \"2017\",\n" +
        "    \"release_date\": \"March 17, 2017\",\n" +
        "    \"score\": 6.1,\n" +
        "    \"poster\": \"tv_shows/poster_iron_fist.jpg\",\n" +
        "    \"overview\": \"Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.\",\n" +
        "    \"lang\": \"English\",\n" +
        "    \"genre\": \"adventure, action, drama\",\n" +
        "    \"runtime\": \"55m\",\n" +
        "    \"cast\" : [\n" +
        "      {\n" +
        "        \"name\": \"Finn Jones\",\n" +
        "        \"character\": \"Danny Rand\",\n" +
        "        \"photo\": \"person/actor_male.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Jessica Henwick\",\n" +
        "        \"character\": \"Colleen Wing\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      },\n" +
        "      {\n" +
        "        \"name\": \"Jessica Stroup\",\n" +
        "        \"character\": \"Joy Meachum\",\n" +
        "        \"photo\": \"person/actor_female.jpg\"\n" +
        "      }\n" +
        "    ]\n" +
        "  }\n" +
        "]"