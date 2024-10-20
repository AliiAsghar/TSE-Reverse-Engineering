package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agyf implements aguc {
    public static final agyf a = new agyf();
    public final Map c;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Map d = new HashMap();

    public agyf() {
        Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(agyh.a)));
        this.c = new WeakHashMap();
        agub.a.a(this);
    }

    public final agye a(Class cls, String str, Object obj) {
        agye agyeVar;
        agye agyeVar2 = (agye) this.b.get(str);
        if (agyeVar2 != null) {
            if (agyeVar2.b != cls) {
                if (!ahaw.a) {
                    this.b.remove(str);
                } else {
                    throw new IllegalStateException("Flag [" + str + "] with different type already exists: " + agyeVar2.b.toString());
                }
            }
            agyeVar2.i(obj);
            return agyeVar2;
        }
        if (ahaw.a && (TextUtils.isEmpty(str) || !str.matches("^[a-zA-Z0-9_]*$"))) {
            throw new IllegalStateException(a.bW(str, "Invalid flag name [", "]"));
        }
        agyeVar2 = new agye(str, cls);
        synchronized (this.d) {
            Set set = (Set) this.d.remove(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    agyeVar2.g((agyi) it.next());
                }
            }
            agyeVar = (agye) this.b.putIfAbsent(str, agyeVar2);
        }
        if (agyeVar != null) {
            agyeVar2 = agyeVar;
        }
        agyeVar2.i(obj);
        return agyeVar2;
    }
}
