package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbp {
    public final apri a;
    public final aiza b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final aprx f;
    public final int g;
    public final Integer h;
    public final aiyq i;
    public final boolean j;
    public final boolean k;
    public final aizd l;
    public final Bundle m;

    public ajbp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajbp) {
            ajbp ajbpVar = (ajbp) obj;
            if (this.a.equals(ajbpVar.a) && this.b.equals(ajbpVar.b) && this.c == ajbpVar.c && ((num = this.d) != null ? num.equals(ajbpVar.d) : ajbpVar.d == null) && this.e.equals(ajbpVar.e) && this.f.equals(ajbpVar.f) && this.g == ajbpVar.g && ((num2 = this.h) != null ? num2.equals(ajbpVar.h) : ajbpVar.h == null) && this.i.equals(ajbpVar.i) && this.j == ajbpVar.j && this.k == ajbpVar.k && this.l.equals(ajbpVar.l) && this.m.equals(ajbpVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Integer num = this.d;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = 1231;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = ((((((((((((hashCode2 * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ hashCode) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        Integer num2 = this.h;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ i3) * 1000003) ^ this.i.hashCode()) * 1000003;
        if (true != this.j) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (hashCode4 ^ i2) * 1000003;
        if (true != this.k) {
            i4 = 1237;
        }
        return ((((i5 ^ i4) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.m;
        aizd aizdVar = this.l;
        aiyq aiyqVar = this.i;
        aprx aprxVar = this.f;
        aiza aizaVar = this.b;
        return "SurveyQuestionsContainerViewArgs{surveyPayload=" + String.valueOf(this.a) + ", answer=" + String.valueOf(aizaVar) + ", isSubmitting=" + this.c + ", ignoreFirstQuestion=false, logoResId=" + this.d + ", triggerId=" + this.e + ", surveySession=" + String.valueOf(aprxVar) + ", startingQuestionIndex=" + this.g + ", currentItem=" + this.h + ", surveyCompletionStyle=" + String.valueOf(aiyqVar) + ", hideCloseButton=" + this.j + ", keepNextButtonForLastQuestion=" + this.k + ", surveyStyle=" + String.valueOf(aizdVar) + ", singleSelectOrdinalAnswerMappings=" + String.valueOf(bundle) + "}";
    }

    public ajbp(apri apriVar, aiza aizaVar, boolean z, Integer num, String str, aprx aprxVar, int i, Integer num2, aiyq aiyqVar, boolean z2, boolean z3, aizd aizdVar, Bundle bundle) {
        this.a = apriVar;
        this.b = aizaVar;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = aprxVar;
        this.g = i;
        this.h = num2;
        this.i = aiyqVar;
        this.j = z2;
        this.k = z3;
        this.l = aizdVar;
        this.m = bundle;
    }
}
