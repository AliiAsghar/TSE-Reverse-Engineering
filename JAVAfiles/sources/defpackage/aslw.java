package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslw {
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public aslw() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        char[] cArr = aslx.a;
        String str = this.a;
        str.getClass();
        return aotl.ao(str);
    }

    public final aslx a() {
        ArrayList arrayList;
        String str;
        String str2 = this.a;
        if (str2 != null) {
            char[] cArr = aslx.a;
            String ap = aotl.ap(this.b, 0, 0, false, 7);
            String ap2 = aotl.ap(this.c, 0, 0, false, 7);
            String str3 = this.d;
            if (str3 != null) {
                int d = d();
                List list = this.f;
                ArrayList arrayList2 = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(aotl.ap((String) it.next(), 0, 0, false, 7));
                }
                List<String> list2 = this.g;
                String str4 = null;
                if (list2 != null) {
                    arrayList = new ArrayList(aqjn.J(list2, 10));
                    for (String str5 : list2) {
                        if (str5 != null) {
                            str = aotl.ap(str5, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str6 = this.h;
                if (str6 != null) {
                    str4 = aotl.ap(str6, 0, 0, false, 7);
                }
                return new aslx(str2, ap, ap2, str3, d, arrayList2, arrayList, str4, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void b(String str) {
        List list;
        if (str != null) {
            char[] cArr = aslx.a;
            list = aotl.aq(aotl.ar(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            list = null;
        }
        this.g = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x022b, code lost:
    
        if (r1 < 65536) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x006d, code lost:
    
        if (r6 != ':') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.aslx r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aslw.c(aslx, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        if (r1 != defpackage.aotl.ao(r3)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aslw.toString():java.lang.String");
    }
}
