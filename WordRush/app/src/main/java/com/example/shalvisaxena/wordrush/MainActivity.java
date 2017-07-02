package com.example.shalvisaxena.wordrush;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

import static android.R.attr.data;
import static android.R.attr.dial;
import static android.R.attr.left;
import static android.R.attr.max;
import static android.R.attr.mode;
import static android.R.attr.path;
import static android.R.attr.port;
import static android.R.attr.type;
import static android.R.id.list;
import static android.R.transition.move;
import static com.example.shalvisaxena.wordrush.R.color.textAssigned;
import static com.example.shalvisaxena.wordrush.R.id.s1;
import static com.example.shalvisaxena.wordrush.R.id.s2;
import static com.example.shalvisaxena.wordrush.R.id.s3;
import static com.example.shalvisaxena.wordrush.R.id.s4;

public class MainActivity extends AppCompatActivity {
    //length of words=491
    public String words[] = new String[]{"able", "acid", "aged", "also", "area", "army", "away", "baby", "back", "ball",
            "band", "bank", "base", "bath", "bear", "beat", "been", "beer", "bell", "belt", "best",
            "bill", "bird", "blow", "blue", "boat", "body", "bomb", "bond", "bone", "book", "boom",
            "born", "boss", "both", "bowl", "bulk", "burn", "bush", "busy", "call", "calm", "came",
            "camp", "card", "care", "case", "cash", "cast", "cell", "chat", "chip", "city", "club",
            "coal", "coat", "code", "cold", "come", "cook", "cool", "cope", "copy", "cost", "crew",
            "crop", "dark", "data", "date", "dawn", "days", "dead", "deal", "dean", "dear", "debt",
            "deep", "deny", "desk", "dial", "dick", "diet", "disc", "disk", "does", "done", "door",
            "dose", "down", "draw", "drew", "drop", "drug", "dual", "duke", "dust", "duty", "each",
            "earn", "ease", "east", "easy", "edge", "else", "even", "ever", "evil", "exit", "face",
            "fact", "fail", "fair", "fall", "farm", "fast", "fate", "fear", "feed", "feel", "feet",
            "fell", "felt", "file", "fill", "film", "find", "fine", "fire", "firm", "fish", "five",
            "flat", "flow", "food", "foot", "ford", "form", "fort", "four", "free", "from", "fuel",
            "full", "fund", "gain", "game", "gate", "gave", "gear", "gene", "gift", "girl", "give",
            "glad", "goal", "goes", "gold", "Golf", "gone", "good", "gray", "grew", "grey", "grow",
            "gulf", "hair", "half", "hall", "hand", "hang", "hard", "harm", "hate", "have", "head",
            "hear", "heat", "held", "hell", "help", "here", "hero", "high", "hill", "hire", "hold",
            "hole", "holy", "home", "hope", "host", "hour", "huge", "hung", "hunt", "hurt", "idea",
            "inch", "into", "iron", "item", "jack", "jane", "jean", "join", "jump", "jury", "just",
            "keen", "keep", "kent", "kept", "kick", "kill", "kind", "king", "knee", "knew", "know",
            "lack", "lady", "laid", "lake", "land", "lane", "last", "late", "lead", "left", "less",
            "life", "lift", "like", "line", "link", "list", "live", "load", "loan", "lock", "logo",
            "long", "look", "lord", "lose", "loss", "lost", "love", "luck", "made", "mail", "main",
            "make", "male", "many", "Mark", "mass", "meal", "mean", "meat", "meet", "menu", "mere",
            "mile", "milk", "mill", "mind", "mine", "miss", "mode", "mood", "moon", "more", "most",
            "move", "much", "must", "name", "navy", "near", "neck", "need", "news", "next", "nice",
            "nine", "none", "nose", "note", "okay", "once", "only", "onto", "open", "oral", "over",
            "pace", "pack", "page", "paid", "pain", "pair", "palm", "park", "part", "pass", "past",
            "path", "peak", "pick", "pink", "pipe", "plan", "play", "plot", "plug", "plus", "pool",
            "poor", "port", "post", "pull", "pure", "push", "race", "rail", "rain", "rank", "rare",
            "rate", "read", "real", "rear", "rely", "rent", "rest", "rice", "rich", "ride", "ring",
            "rise", "risk", "road", "rock", "role", "roll", "roof", "room", "root", "rose", "rule",
            "rush", "ruth", "safe", "said", "sake", "sale", "salt", "same", "sand", "save", "seat",
            "seed", "seek", "seem", "seen", "self", "sell", "send", "sent", "sept", "ship", "shop",
            "shot", "show", "shut", "sick", "side", "sign", "site", "size", "skin", "slip", "slow",
            "snow", "soft", "soil", "sold", "sole", "some", "song", "soon", "sort", "soul", "spot",
            "star", "stay", "step", "stop", "such", "suit", "sure", "take", "tale", "talk", "tall",
            "tank", "tape", "task", "team", "tech", "tell", "tend", "term", "test", "text", "than",
            "that", "them", "then", "they", "thin", "this", "thus", "till", "time", "tiny", "told",
            "toll", "tone", "tony", "took", "tool", "tour", "town", "tree", "trip", "true", "tune",
            "turn", "twin", "type", "unit", "upon", "used", "user", "vary", "vast", "very", "vote",
            "wage", "wait", "wake", "walk", "wall", "want", "ward", "warm", "wash", "wave", "ways",
            "weak", "wear", "week", "well", "went", "were", "west", "what", "when", "whom", "wide",
            "wife", "wild", "will", "wind", "wine", "wing", "wire", "wise", "wish", "with", "wood",
            "word", "wore", "work", "yard", "yeah", "year", "your", "zero"};
    TextView s1, s2, s3, s4;
    public TextView[] s = {s1, s2, s3, s4};
    Button g1, g2, g3, g4;
    TextView score1,score2,score3;
    public TextView[] score = {score1,score2,score3};
    ImageView score4;
    public Button[] g = {g1, g2, g3, g4};
    int c = 0;
    static int correct=0, incorrect=0;
    String word;
    ArrayList<Integer> c2 = new ArrayList<Integer>();

    public void start() {
        ArrayList<Integer> c1 = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        while (c2.size() < 491) {
            int randomIndex = random.nextInt(490);
            if (false == c2.contains(randomIndex)) {
                c2.add(randomIndex);
                word = words[randomIndex];
                break;
            }
        }
        while (c1.size() < 4) {
            int randomIndex = random.nextInt(4);
            if (false == c1.contains(randomIndex)) {
                c1.add(randomIndex);
                g[i].setText(String.valueOf(word.charAt(randomIndex)));
                g[i].setEnabled(true);
                g[i].setBackgroundColor(Color.parseColor("#ffffff"));
                s[i].setBackgroundColor(Color.parseColor("#404040"));
                s[i++].setText("");
            }

            score[0].setText(String.valueOf(correct));
            score[2].setText(String.valueOf(incorrect+correct));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (TextView) findViewById(R.id.s1);
        s2 = (TextView) findViewById(R.id.s2);
        s3 = (TextView) findViewById(R.id.s3);
        s4 = (TextView) findViewById(R.id.s4);
        g1 = (Button) findViewById(R.id.g1);
        g2 = (Button) findViewById(R.id.g2);
        g3 = (Button) findViewById(R.id.g3);
        g4 = (Button) findViewById(R.id.g4);
        score1 = (TextView) findViewById(R.id.score1);
        score2 = (TextView) findViewById(R.id.score2);
        score3 = (TextView) findViewById(R.id.score3);
        score4 = (ImageView) findViewById(R.id.score4);

        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        g[0] = g1;
        g[1] = g2;
        g[2] = g3;
        g[3] = g4;
        score[0] = score1;
        score[1] = score2;
        score[2] = score3;

        start();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void reset(View v) {
        c = 0;
        for (int i = 0; i < 4; i++) {
            s[i].setText("");
            s[i].setBackgroundColor(Color.parseColor("#4e6b70"));
            g[i].setEnabled(true);
        }
        start();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void reset() {
        c = 0;
        for (int i = 0; i < 4; i++) {
            s[i].setText("");
            s[i].setBackgroundColor(Color.parseColor("#4e6b70"));
            g[i].setEnabled(true);
        }
        start();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void setAlphabet(View v) {
        Button passed = (Button) v;
        String t = passed.getText().toString();

        s[c].setBackgroundColor(Color.parseColor("#ffd11a"));
        s[c].setText(t);
        c++;
        v.setBackgroundColor(Color.parseColor("#00ccff"));
        v.setEnabled(false);
        if (c == 4) {
            String word1 = "" + s1.getText() + "" + s2.getText() + "" + s3.getText() + "" + s4.getText() + "";
            if (word1.equalsIgnoreCase(word))
            {
                correct++;
                score4.setImageResource(R.drawable.check);
                Toast.makeText(getApplicationContext(), "CORRECT!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                incorrect++;
                score4.setImageResource(R.drawable.cross);
                Toast.makeText(getApplicationContext(), "INCORRECT!!", Toast.LENGTH_SHORT).show();
            }
            reset();
        }

    }


}
