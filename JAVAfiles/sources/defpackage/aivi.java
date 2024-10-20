package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivi {
    public static final aivi a = new aivi(null);
    private final List b;

    static {
        new aivg(null, null);
    }

    public aivi(List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static final String a(String str) {
        try {
            return URLEncoder.encode(str, aivq.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List, java.lang.Object] */
    public static aivg b(Uri uri) {
        aivi aiviVar;
        aivf aivfVar;
        boolean z;
        String[] strArr;
        int i;
        int i2;
        String[] strArr2;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        aivf aivfVar2;
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment)) {
            aiviVar = a;
        } else {
            ArrayList<agrk> arrayList2 = new ArrayList();
            String[] split = encodedFragment.split("&");
            int length = split.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                String[] split2 = split[i4].split("=", 2);
                ArrayList arrayList3 = new ArrayList();
                String str = split2[i3];
                boolean z4 = true;
                boolean z5 = !TextUtils.isEmpty(str);
                Object[] objArr = new Object[1];
                objArr[i3] = encodedFragment;
                ahmc.af(z5, "malformed key: %s", objArr);
                if (split2.length == 2 && !TextUtils.isEmpty(split2[1])) {
                    z = 1;
                } else {
                    z = i3;
                }
                Object[] objArr2 = new Object[1];
                objArr2[i3] = encodedFragment;
                ahmc.af(z, "missing param value: %s", objArr2);
                String[] split3 = split2[1].split("\\+");
                int i5 = i3;
                while (i5 < split3.length) {
                    String str2 = split3[i5];
                    if (str2.isEmpty()) {
                        strArr = split;
                        i = length;
                        i2 = i3;
                        strArr2 = split3;
                        z2 = z4;
                    } else {
                        int indexOf = str2.indexOf("(");
                        if (indexOf != -1) {
                            String substring = str2.substring(indexOf);
                            if (substring.charAt(i3) == '(' && substring.charAt(substring.length() - 1) == ')') {
                                strArr = split;
                                z3 = true;
                            } else {
                                strArr = split;
                                z3 = false;
                            }
                            ahmc.af(z3, "malformed fragment subparams: %s", encodedFragment);
                            String substring2 = substring.substring(1, substring.length() - 1);
                            arrayList = new ArrayList();
                            String[] split4 = substring2.split(",");
                            int i6 = 0;
                            while (i6 < split4.length) {
                                int i7 = length;
                                String[] split5 = split4[i6].split("=", 2);
                                String str3 = split5[0];
                                String[] strArr3 = split4;
                                String[] strArr4 = split3;
                                ahmc.af(!TextUtils.isEmpty(str3), "missing fragment subparam key: %s", substring2);
                                if (split5.length == 2 && !TextUtils.isEmpty(split5[1])) {
                                    arrayList.add(new aivh(c(str3), c(split5[1])));
                                } else {
                                    arrayList.add(new aivh(c(str3), null));
                                }
                                i6++;
                                length = i7;
                                split4 = strArr3;
                                split3 = strArr4;
                            }
                            i = length;
                            strArr2 = split3;
                            i2 = 0;
                            str2 = str2.substring(0, indexOf);
                            z2 = true;
                        } else {
                            strArr = split;
                            i = length;
                            i2 = i3;
                            strArr2 = split3;
                            z2 = true;
                            boolean z6 = !str2.contains(")");
                            Object[] objArr3 = new Object[1];
                            objArr3[i2] = encodedFragment;
                            ahmc.af(z6, "malformed fragment subparams: %s", objArr3);
                            arrayList = null;
                        }
                        arrayList3.add(new agrk(c(str2), (List) arrayList));
                    }
                    i5++;
                    z4 = z2;
                    split = strArr;
                    split3 = strArr2;
                    i3 = i2;
                    length = i;
                }
                arrayList2.add(new agrk(c(str), (List) arrayList3, (byte[]) null));
                i4++;
                i3 = i3;
                length = length;
                split = split;
            }
            int i8 = i3;
            ArrayList<agrk> arrayList4 = new ArrayList();
            for (agrk agrkVar : arrayList2) {
                int i9 = i8;
                while (true) {
                    if (i9 < arrayList4.size()) {
                        if (((String) ((agrk) arrayList4.get(i9)).b).equals(agrkVar.b)) {
                            arrayList4.set(i9, agrkVar);
                            break;
                        }
                        i9++;
                    } else {
                        arrayList4.add(agrkVar);
                        break;
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (agrk agrkVar2 : arrayList4) {
                if (agrkVar2.a.isEmpty()) {
                    aivfVar = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    for (agrk agrkVar3 : agrkVar2.a) {
                        arrayList6.add(new aivg((String) agrkVar3.b, agrkVar3.a));
                    }
                    aivfVar = new aivf((String) agrkVar2.b, arrayList6);
                }
                if (aivfVar != null) {
                    arrayList5.add(aivfVar);
                }
            }
            aiviVar = new aivi(arrayList5);
        }
        Iterator it = aiviVar.b.iterator();
        while (true) {
            if (it.hasNext()) {
                aivfVar2 = (aivf) it.next();
                if (aivfVar2.a.equals("transform")) {
                    break;
                }
            } else {
                aivfVar2 = null;
                break;
            }
        }
        if (aivfVar2 == null) {
            return null;
        }
        for (aivg aivgVar : aivfVar2.b) {
            if (aivgVar.a.equals("encrypt")) {
                return aivgVar;
            }
        }
        return null;
    }

    private static final String c(String str) {
        try {
            return URLDecoder.decode(str, aivq.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    public final String toString() {
        return TextUtils.join("&", this.b);
    }
}
