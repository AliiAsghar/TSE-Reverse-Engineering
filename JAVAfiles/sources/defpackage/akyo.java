package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akyo implements akxw {
    private final /* synthetic */ int a;

    @Override // defpackage.akxw
    public final Object a(albi albiVar) {
        double d;
        int i = this.a;
        String str = "";
        if (i != 0) {
            if (i != 1) {
                akye akyeVar = akyd.a;
                if (albiVar.c == 4) {
                    d = ((Double) albiVar.d).doubleValue();
                } else {
                    d = 0.0d;
                }
                return Integer.valueOf((int) d);
            }
            akye akyeVar2 = akyd.a;
            Optional empty = Optional.empty();
            if ((1 & albiVar.b) != 0) {
                empty = Optional.of(albiVar.e);
            }
            if (albiVar.c == 2) {
                str = (String) albiVar.d;
            }
            if (str != null) {
                return new alaa(empty, str);
            }
            throw new NullPointerException("Null value");
        }
        akye akyeVar3 = akyd.a;
        if ((albiVar.b & 1) != 0) {
            return albiVar.e;
        }
        if (albiVar.c != 2) {
            return "";
        }
        return (String) albiVar.d;
    }
}
