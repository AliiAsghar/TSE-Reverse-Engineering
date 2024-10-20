package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gg {
    public static final alnr a;

    static {
        alnp alnpVar = new alnp();
        alnpVar.c(0, "*");
        alnpVar.c(3, "us-ascii");
        alnpVar.c(4, "iso-8859-1");
        alnpVar.c(5, "iso-8859-2");
        alnpVar.c(6, "iso-8859-3");
        alnpVar.c(7, "iso-8859-4");
        alnpVar.c(8, "iso-8859-5");
        alnpVar.c(9, "iso-8859-6");
        alnpVar.c(10, "iso-8859-7");
        alnpVar.c(11, "iso-8859-8");
        alnpVar.c(12, "iso-8859-9");
        alnpVar.c(17, "shift_JIS");
        alnpVar.c(18, "euc-jp");
        alnpVar.c(38, "euc-kr");
        alnpVar.c(39, "iso-2022-jp");
        alnpVar.c(40, "iso-2022-jp-2");
        alnpVar.c(106, "utf-8");
        alnpVar.c(113, "gbk");
        alnpVar.c(114, "gb18030");
        alnpVar.c(2025, "gb2312");
        alnpVar.c(2026, "big5");
        alnpVar.c(1000, "iso-10646-ucs-2");
        alnpVar.c(1015, "utf-16");
        alnpVar.c(2085, "hz-gb-2312");
        a = alnpVar.b();
    }

    public static String a(int i) {
        String str = (String) a.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }
}
