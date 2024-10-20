package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoyd {
    private static final algs b = new algs("-");
    public final arbj a;

    public aoyd() {
        this.a = new arbj((byte[]) null, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final String a() {
        Map.Entry entry;
        Map.Entry entry2;
        boolean z;
        String j;
        int i;
        arbj arbjVar = this.a;
        Object obj = arbjVar.a;
        ?? r2 = arbjVar.b;
        ?? r0 = arbjVar.c;
        if (r0.size() == 0) {
            if (((String) obj).isEmpty()) {
                return "";
            }
            return "".concat(String.valueOf(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r2.entrySet().iterator();
        Iterator it2 = r0.entrySet().iterator();
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        if (it2.hasNext()) {
            entry2 = (Map.Entry) it2.next();
        } else {
            entry2 = null;
        }
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (entry == null && entry2 == null) {
                if (z2) {
                    arrayList.add(((String) obj).substring(i2, i3));
                }
                if (arrayList.isEmpty()) {
                    return "";
                }
                return "".concat(b.d(arrayList));
            }
            if (entry2 == null) {
                z = true;
            } else if (entry == null) {
                z = false;
            } else {
                int compareTo = ((aoyb) entry.getKey()).compareTo((aoyb) entry2.getKey());
                if (compareTo < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (compareTo == 0) {
                    entry = null;
                }
            }
            if (z) {
                aoyc aoycVar = (aoyc) entry.getValue();
                if (!z2) {
                    i2 = aoycVar.a;
                    i = aoycVar.c;
                } else {
                    int i4 = aoycVar.a;
                    if (i4 == i3 + 1) {
                        i3 = i4 + aoycVar.c;
                        entry = null;
                        z2 = true;
                    } else {
                        arrayList.add(((String) obj).substring(i2, i3));
                        i2 = aoycVar.a;
                        i = aoycVar.c;
                    }
                }
                i3 = i + i2;
                entry = null;
                z2 = true;
            } else {
                aoyb aoybVar = (aoyb) entry2.getKey();
                atkn atknVar = (atkn) entry2.getValue();
                if (z2) {
                    arrayList.add(((String) obj).substring(i2, i3));
                }
                if (atknVar.b != null) {
                    boolean z3 = atknVar.a;
                    String str = aoybVar.ba;
                    switch (aoybVar.bb) {
                        case FIXED_LENGTH_BASE_64:
                            j = amcn.f.g().j(albo.cn(((Long) ((atkn) entry2.getValue()).b).longValue()));
                            break;
                        case BOOLEAN:
                            j = "";
                            break;
                        case STRING:
                            j = ((String) ((atkn) entry2.getValue()).b).replace(';', ':');
                            break;
                        case INTEGER:
                            j = ((Integer) ((atkn) entry2.getValue()).b).toString();
                            break;
                        case LONG:
                            j = ((Long) ((atkn) entry2.getValue()).b).toString();
                            break;
                        case FLOAT:
                            j = ((Float) ((atkn) entry2.getValue()).b).toString();
                            break;
                        case PREFIX_HEX:
                            Integer num = (Integer) ((atkn) entry2.getValue()).b;
                            num.intValue();
                            j = "0x".concat(String.valueOf(String.format("%08x", num)));
                            break;
                        case FIFE_SAFE_BASE_64:
                            j = amcn.f.g().j(((String) ((atkn) entry2.getValue()).b).getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                            break;
                        default:
                            throw new IllegalStateException("OptionType " + String.valueOf(aoybVar.bb) + " not handled.");
                    }
                    arrayList.add(String.valueOf(str).concat(String.valueOf(j)));
                }
                entry2 = null;
                z2 = false;
            }
            if (entry == null && it.hasNext()) {
                entry = (Map.Entry) it.next();
            }
            if (entry2 == null && it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
            }
        }
    }

    public aoyd(asqe asqeVar) {
        this.a = new arbj(asqeVar);
    }
}
