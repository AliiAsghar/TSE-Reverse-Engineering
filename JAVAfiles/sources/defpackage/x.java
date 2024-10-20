package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class x extends o {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new f();
    public static final x a = new x();

    private x() {
    }

    public final w a(String str) {
        boolean containsKey;
        u uVar;
        w wVar;
        Object[][] objArr;
        boolean z;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            uVar = null;
            if (containsKey) {
                wVar = (w) this.e.get(str);
            } else {
                wVar = null;
            }
        }
        if (!containsKey) {
            try {
                Object[][] objArr2 = (Object[][]) d.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object[] objArr3 = objArr2[i];
                        if (str.equals(objArr3[0])) {
                            objArr = (Object[][]) objArr3[1];
                            break;
                        }
                        i++;
                    } else {
                        objArr = null;
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr4 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr4[0]);
                    sb.append(": ");
                    sb.append((String) objArr4[1]);
                }
                String sb2 = sb.toString();
                w wVar2 = w.a;
                String trim = sb2.trim();
                if (trim.length() == 0) {
                    wVar = w.a;
                } else {
                    v vVar = new v();
                    if (trim.endsWith(";")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    for (String str2 : w.g.split(trim)) {
                        u a2 = w.a(str2.trim());
                        boolean z2 = vVar.a;
                        if (a2.c == null && a2.d == null) {
                            z = false;
                            vVar.a = z2 | z;
                            vVar.a(a2);
                        }
                        z = true;
                        vVar.a = z2 | z;
                        vVar.a(a2);
                    }
                    Iterator it = vVar.b.iterator();
                    while (it.hasNext()) {
                        u uVar2 = (u) it.next();
                        if ("other".equals(uVar2.a)) {
                            it.remove();
                            uVar = uVar2;
                        }
                    }
                    if (uVar == null) {
                        uVar = w.a("other:");
                    }
                    vVar.b.add(uVar);
                    wVar = new w(vVar);
                }
            } catch (ParseException | MissingResourceException unused) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    wVar = (w) this.e.get(str);
                } else {
                    this.e.put(str, wVar);
                }
            }
        }
        return wVar;
    }

    public final void b() {
        Map map;
        Map emptyMap;
        Map emptyMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                emptyMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    emptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                emptyMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    emptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                emptyMap = Collections.emptyMap();
                emptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = emptyMap;
                    this.c = emptyMap2;
                }
            }
        }
    }
}
