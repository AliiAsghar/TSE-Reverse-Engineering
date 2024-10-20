package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atql {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String c;
    public final aslx d;
    public String e;
    public aslw f;
    public final asmg g = new asmg();
    public aslz h;
    public final boolean i;
    public asma j;
    public asmk k;
    public asmb l;
    public final asuo m;

    public atql(String str, aslx aslxVar, String str2, aslv aslvVar, aslz aslzVar, boolean z, boolean z2, boolean z3) {
        this.c = str;
        this.d = aslxVar;
        this.e = str2;
        this.h = aslzVar;
        this.i = z;
        if (aslvVar != null) {
            this.m = aslvVar.e();
        } else {
            this.m = new asuo((char[]) null);
        }
        if (z2) {
            this.l = new asmb();
            return;
        }
        if (z3) {
            asma asmaVar = new asma();
            this.j = asmaVar;
            aslz aslzVar2 = asmc.b;
            aslzVar2.getClass();
            if (d.F(aslzVar2.d, "multipart")) {
                asmaVar.b = aslzVar2;
            } else {
                Objects.toString(aslzVar2);
                throw new IllegalArgumentException("multipart != ".concat(aslzVar2.c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection, java.lang.Object] */
    public final void a(String str, String str2, boolean z) {
        if (z) {
            asmb asmbVar = this.l;
            ?? r0 = asmbVar.a;
            char[] cArr = aslx.a;
            r0.add(aotl.ar(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            asmbVar.b.add(aotl.ar(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        asmb asmbVar2 = this.l;
        ?? r02 = asmbVar2.a;
        char[] cArr2 = aslx.a;
        r02.add(aotl.ar(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        asmbVar2.b.add(aotl.ar(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2) {
        if (assi.a.equalsIgnoreCase(str)) {
            try {
                this.h = aotl.an(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)), e);
            }
        }
        this.m.i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aslv aslvVar, asmk asmkVar) {
        asma asmaVar = this.j;
        asmkVar.getClass();
        if (aslvVar.b(assi.a) == null) {
            if (aslvVar.b("Content-Length") == null) {
                asmaVar.a(new asmb(aslvVar, asmkVar));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, String str2, boolean z) {
        String str3 = this.e;
        String str4 = null;
        if (str3 != null) {
            aslw h = this.d.h(str3);
            this.f = h;
            if (h != null) {
                this.e = null;
            } else {
                aslx aslxVar = this.d;
                throw new IllegalArgumentException("Malformed URL. Base: " + aslxVar.g + ", Relative: " + this.e);
            }
        }
        if (z) {
            aslw aslwVar = this.f;
            str.getClass();
            if (aslwVar.g == null) {
                aslwVar.g = new ArrayList();
            }
            List list = aslwVar.g;
            list.getClass();
            char[] cArr = aslx.a;
            list.add(aotl.ar(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            List list2 = aslwVar.g;
            list2.getClass();
            if (str2 != null) {
                str4 = aotl.ar(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211);
            }
            list2.add(str4);
            return;
        }
        aslw aslwVar2 = this.f;
        str.getClass();
        if (aslwVar2.g == null) {
            aslwVar2.g = new ArrayList();
        }
        List list3 = aslwVar2.g;
        list3.getClass();
        char[] cArr2 = aslx.a;
        list3.add(aotl.ar(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        List list4 = aslwVar2.g;
        list4.getClass();
        if (str2 != null) {
            str4 = aotl.ar(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
        }
        list4.add(str4);
    }
}
