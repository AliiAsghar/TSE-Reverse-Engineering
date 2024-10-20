package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpg {
    public static final String[] a = new String[0];
    public static final alor b;

    static {
        alok alokVar = new alok();
        alokVar.h("NULL", "@null");
        alokVar.h("true", "true");
        alokVar.h("TRUE", "true");
        alokVar.h("false", "false");
        alokVar.h("FALSE", "false");
        b = alokVar.b();
    }

    public static void a(List list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
        } else {
            list.add("");
        }
    }
}
