package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenr {
    public final aeno a;
    public final aenk b;
    public final aenp c;
    public final aeoi d;
    public final aenl e;
    private final aenq f;

    public aenr(aeno aenoVar, aenk aenkVar, aenp aenpVar, aeoi aeoiVar, aenl aenlVar, aenq aenqVar) {
        aenoVar.getClass();
        aeoiVar.getClass();
        this.a = aenoVar;
        this.b = aenkVar;
        this.c = aenpVar;
        this.d = aeoiVar;
        this.e = aenlVar;
        this.f = aenqVar;
    }

    public final boolean a() {
        if (this.a.b.length() <= 0 && this.b.a.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenr)) {
            return false;
        }
        aenr aenrVar = (aenr) obj;
        if (d.F(this.a, aenrVar.a) && d.F(this.b, aenrVar.b) && d.F(this.c, aenrVar.c) && d.F(this.d, aenrVar.d) && d.F(this.e, aenrVar.e) && d.F(this.f, aenrVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        aenp aenpVar = this.c;
        int i = 0;
        if (aenpVar == null) {
            hashCode = 0;
        } else {
            hashCode = aenpVar.hashCode();
        }
        int hashCode3 = ((((hashCode2 * 31) + hashCode) * 31) + this.d.hashCode()) * 31;
        aenl aenlVar = this.e;
        if (aenlVar != null) {
            i = aenlVar.hashCode();
        }
        return ((hashCode3 + i) * 31) + 1237;
    }

    public final String toString() {
        return "ComposeRowDraftUiData(text=" + this.a + ", attachments=" + this.b + ", topUiData=" + this.c + ", sendButton=" + this.d + ", info=" + this.e + ", flags=" + this.f + ")";
    }

    public /* synthetic */ aenr(aeno aenoVar, aenk aenkVar, aeoi aeoiVar, aenq aenqVar) {
        this(aenoVar, aenkVar, null, aeoiVar, null, aenqVar);
    }
}
