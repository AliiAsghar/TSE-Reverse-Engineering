package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akot {
    public final akpm a;
    public final aknz b;
    public final ajwt c;

    public akot(akpm akpmVar) {
        ajwt ajwtVar;
        this.a = akpmVar;
        akpl akplVar = akpmVar.c;
        this.b = new aknz(akplVar == null ? akpl.a : akplVar);
        if ((akpmVar.b & 2) != 0) {
            ajwtVar = ajwt.a(akpmVar.d);
        } else {
            ajwtVar = null;
        }
        this.c = ajwtVar;
    }

    public final boolean a() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akot) {
            akot akotVar = (akot) obj;
            if (this.b.equals(akotVar.b)) {
                ajwt ajwtVar = this.c;
                ajwt ajwtVar2 = akotVar.c;
                if (ajwtVar == null) {
                    if (ajwtVar2 == null) {
                        return true;
                    }
                } else if (ajwtVar.equals(ajwtVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
