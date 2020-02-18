package dev.adif.supermanmath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    // Logic Handling

    Button btnPositive, btnNegative;
    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10,
            card11, card12, card13, card14, card15, card16, card17, card18, card19, card20;
    ImageView supermanPlus, supermanMinus;
    ImageView pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13,
            pos14, pos15, pos16, pos17, pos18, pos19, pos20,
            neg1, neg2, neg3, neg4, neg5, neg6, neg7, neg8, neg9, neg10, neg11, neg12, neg13,
            neg14, neg15, neg16, neg17, neg18, neg19, neg20;
    LinearLayout layoutTop, layoutBottom;
    ImageView[] posTopArr = new ImageView[10];
    ImageView[] posBottomArr = new ImageView[10];
    ImageView[] negTopArr = new ImageView[10];
    ImageView[] negBottomArr = new ImageView[10];


    int positive = 0;
    int negative = 0;
    int positiveTop = 0;
    int positiveBottom = 0;
    int negativeTop = 0;
    int negativeBottom = 0;
    boolean topState = true;
    boolean bottomState = false;
    int posResult, negResult, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // View Handling

        // Init Button
        btnPositive = findViewById(R.id.btnPositive);
        btnNegative = findViewById(R.id.btnNegative);
        
        // Init Layout
        layoutTop = findViewById(R.id.layoutTop);
        layoutBottom = findViewById(R.id.layoutBottom);

        // Init Card
        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        card7 = findViewById(R.id.card7);
        card8 = findViewById(R.id.card8);
        card9 = findViewById(R.id.card9);
        card10 = findViewById(R.id.card10);
        card11 = findViewById(R.id.card11);
        card12 = findViewById(R.id.card12);
        card13 = findViewById(R.id.card13);
        card14 = findViewById(R.id.card14);
        card15 = findViewById(R.id.card15);
        card16 = findViewById(R.id.card16);
        card17 = findViewById(R.id.card17);
        card18 = findViewById(R.id.card18);
        card19 = findViewById(R.id.card19);
        card20 = findViewById(R.id.card20);
        pos1 = findViewById(R.id.pos1);
        pos2 = findViewById(R.id.pos2);
        pos3 = findViewById(R.id.pos3);
        pos4 = findViewById(R.id.pos4);
        pos5 = findViewById(R.id.pos5);
        pos6 = findViewById(R.id.pos6);
        pos7 = findViewById(R.id.pos7);
        pos8 = findViewById(R.id.pos8);
        pos9 = findViewById(R.id.pos9);
        pos10 = findViewById(R.id.pos10);
        pos11 = findViewById(R.id.pos11);
        pos12 = findViewById(R.id.pos12);
        pos13 = findViewById(R.id.pos13);
        pos14 = findViewById(R.id.pos14);
        pos15 = findViewById(R.id.pos15);
        pos16 = findViewById(R.id.pos16);
        pos17 = findViewById(R.id.pos17);
        pos18 = findViewById(R.id.pos18);
        pos19 = findViewById(R.id.pos19);
        pos20 = findViewById(R.id.pos20);
        neg1 = findViewById(R.id.neg1);
        neg2 = findViewById(R.id.neg2);
        neg3 = findViewById(R.id.neg3);
        neg4 = findViewById(R.id.neg4);
        neg5 = findViewById(R.id.neg5);
        neg6 = findViewById(R.id.neg6);
        neg7 = findViewById(R.id.neg7);
        neg8 = findViewById(R.id.neg8);
        neg9 = findViewById(R.id.neg9);
        neg10 = findViewById(R.id.neg10);
        neg11 = findViewById(R.id.neg11);
        neg12 = findViewById(R.id.neg12);
        neg13 = findViewById(R.id.neg13);
        neg14 = findViewById(R.id.neg14);
        neg15 = findViewById(R.id.neg15);
        neg16 = findViewById(R.id.neg16);
        neg17 = findViewById(R.id.neg17);
        neg18 = findViewById(R.id.neg18);
        neg19 = findViewById(R.id.neg19);
        neg20 = findViewById(R.id.neg20);

        // Init Image
        supermanPlus = findViewById(R.id.supermanPlus);
        supermanMinus = findViewById(R.id.supermanMinus);

        posTopArr[0] = pos1;
        posTopArr[1] = pos2;
        posTopArr[2] = pos3;
        posTopArr[3] = pos4;
        posTopArr[4] = pos5;
        posTopArr[5] = pos6;
        posTopArr[6] = pos7;
        posTopArr[7] = pos8;
        posTopArr[8] = pos9;
        posTopArr[9] = pos10;
        posBottomArr[0] = pos11;
        posBottomArr[1] = pos12;
        posBottomArr[2] = pos13;
        posBottomArr[3] = pos14;
        posBottomArr[4] = pos15;
        posBottomArr[5] = pos16;
        posBottomArr[6] = pos17;
        posBottomArr[7] = pos18;
        posBottomArr[8] = pos19;
        posBottomArr[9] = pos20;

        negTopArr[0] = neg1;
        negTopArr[1] = neg2;
        negTopArr[2] = neg3;
        negTopArr[3] = neg4;
        negTopArr[4] = neg5;
        negTopArr[5] = neg6;
        negTopArr[6] = neg7;
        negTopArr[7] = neg8;
        negTopArr[8] = neg9;
        negTopArr[9] = neg10;
        negBottomArr[0] = neg11;
        negBottomArr[1] = neg12;
        negBottomArr[2] = neg13;
        negBottomArr[3] = neg14;
        negBottomArr[4] = neg15;
        negBottomArr[5] = neg16;
        negBottomArr[6] = neg17;
        negBottomArr[7] = neg18;
        negBottomArr[8] = neg19;
        negBottomArr[9] = neg20;

    }

    public void setTop(View view) {
        if(topState != true) {
            topState = true;
            bottomState = false;
            // System.out.println(topState);
        }
    }

    public void setBottom(View view) {
        if(bottomState != true) {
            bottomState = true;
            topState = false;
            // System.out.println(bottomState);
        }
    }

    public void setPositive(View view) {
        positive = positive + 1;
        if(positive <= 10 && topState == true) {
            positiveTop = positiveTop + 1;
            System.out.println("PositiveTop = " + positiveTop + " dan Top State = " + topState);
            int posTopIdx = positiveTop - 1;
            posTopArr[posTopIdx].setVisibility(View.VISIBLE);
        } else if((positive <= 10 || positive >= 10) && topState == false) {
            positiveBottom = positiveBottom + 1;
            System.out.println("PositiveBottom = " + positiveBottom + " dan Top State = " + topState);
            int posBottomIdx = positiveBottom - 1;
            posBottomArr[posBottomIdx].setVisibility(View.VISIBLE);
        } else if(positive >= 20) {
            System.out.println("Break !!!");
        }
    }

    public void setNegative(View view) {
        negative = negative + 1;
        if(negative <= 10 && topState == true) {
            negativeTop = negativeTop + 1;
            System.out.println("negativeTop = " + negativeTop + " dan Top State = " + topState);
            int negTopIdx = negativeTop - 1;
            negTopArr[negTopIdx].setVisibility(View.VISIBLE);
        } else if((negative <= 10 || negative >= 10) && topState == false) {
            negativeBottom = negativeBottom + 1;
            System.out.println("negativeBottom = " + negativeBottom + " dan Top State = " + topState);
            int negBottomIdx = negativeBottom - 1;
            negBottomArr[negBottomIdx].setVisibility(View.VISIBLE);
        } else if(negative >= 20) {
            System.out.println("Break !!!");
        }
    }

    public void setResult(View view) {
        posResult = positiveTop + positiveBottom;
        negResult = (negativeTop + negativeBottom) * -1;
        result = posResult + negResult;


        if(positive != 0 || negative !=0) {
            if(positive > negative) {
                for(int i = 0; i < negative; i++){
                    posTopArr[i].setAlpha(0.3f);
                    posBottomArr[i].setAlpha(0.3f);
                    negTopArr[i].setAlpha(0.3f);
                    negBottomArr[i].setAlpha(0.3f);
                }
            } else if(negative > positive) {
                for(int i = 0; i < positive; i++){
                    posTopArr[i].setAlpha(0.3f);
                    posBottomArr[i].setAlpha(0.3f);
                    negTopArr[i].setAlpha(0.3f);
                    negBottomArr[i].setAlpha(0.3f);
                }
            } else if(positive == negative){
                for(int i = 0; i < positive; i++){
                    posTopArr[i].setAlpha(0.3f);
                    posBottomArr[i].setAlpha(0.3f);
                    negTopArr[i].setAlpha(0.3f);
                    negBottomArr[i].setAlpha(0.3f);
                }
            }
        }


        System.out.println("Hasil = " + result);
    }

    public void resetAll(View view) {
        positive = 0;
        negative = 0;
        positiveTop = 0;
        positiveBottom = 0;
        negativeTop = 0;
        negativeBottom = 0;
        topState = true;
        bottomState = false;
        for(int i = 0; i < 10; i++){
            posTopArr[i].setVisibility(View.INVISIBLE);
            posBottomArr[i].setVisibility(View.INVISIBLE);
            negTopArr[i].setVisibility(View.INVISIBLE);
            negBottomArr[i].setVisibility(View.INVISIBLE);
            posTopArr[i].setAlpha(1f);
            posBottomArr[i].setAlpha(1f);
            negTopArr[i].setAlpha(1f);
            negBottomArr[i].setAlpha(1f);
        }
    }

}
