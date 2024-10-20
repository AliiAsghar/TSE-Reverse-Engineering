package com.google.knowledge.hobbes.chat.common;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PredictorResult {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class BooleanPrediction extends Prediction {
        public boolean indicator;

        public BooleanPrediction(boolean z, float f) {
            super(f);
            this.indicator = z;
        }

        @Override // com.google.knowledge.hobbes.chat.common.PredictorResult.Prediction
        protected Object getValue() {
            return Boolean.valueOf(this.indicator);
        }

        @Override // com.google.knowledge.hobbes.chat.common.PredictorResult.Prediction
        public String toString() {
            return String.format("(Indicator, score): (%b, %f)", Boolean.valueOf(this.indicator), Float.valueOf(this.score));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Prediction {
        public float score;

        public Prediction(float f) {
            this.score = f;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Prediction)) {
                return false;
            }
            Prediction prediction = (Prediction) obj;
            if (!getValue().equals(prediction.getValue()) || this.score != prediction.score) {
                return false;
            }
            return true;
        }

        protected abstract Object getValue();

        public int hashCode() {
            return getValue().hashCode() + ((int) (this.score * 100.0f));
        }

        public abstract String toString();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class TextPrediction extends Prediction {
        public final int end;
        public final int start;
        public String text;

        public TextPrediction(String str, float f) {
            this(str, f, -1, -1);
        }

        @Override // com.google.knowledge.hobbes.chat.common.PredictorResult.Prediction
        protected Object getValue() {
            return this.text;
        }

        @Override // com.google.knowledge.hobbes.chat.common.PredictorResult.Prediction
        public String toString() {
            if (this.start != -1) {
                return String.format("(Text with score and span): (%s, %f, [%d, %d))", this.text, Float.valueOf(this.score), Integer.valueOf(this.start), Integer.valueOf(this.end));
            }
            return String.format("(Text, score): (%s, %f)", this.text, Float.valueOf(this.score));
        }

        public TextPrediction(String str, float f, int i, int i2) {
            super(f);
            this.text = str;
            this.start = i;
            this.end = i2;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class Types {
        public static final String REPLY_SUGGESTION = "REPLY_SUGGESTION";

        private Types() {
        }
    }

    private PredictorResult() {
    }
}
