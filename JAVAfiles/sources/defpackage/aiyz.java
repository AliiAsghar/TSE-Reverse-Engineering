package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyz {
    public final String a;
    public final aizd b;
    private final String c;

    public aiyz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiyz) {
            aiyz aiyzVar = (aiyz) obj;
            if (this.a.equals(aiyzVar.a) && this.c.equals(aiyzVar.c) && this.b.equals(aiyzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + String.valueOf(this.b) + "}";
    }

    public aiyz(String str, String str2, aizd aizdVar) {
        this.a = str;
        this.c = str2;
        this.b = aizdVar;
    }
}
