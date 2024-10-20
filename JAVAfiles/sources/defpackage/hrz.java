package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrz implements hrw {
    private final Map b;
    private volatile Map c;

    public hrz(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    @Override // defpackage.hrw
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : this.b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((hry) list.get(i)).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    this.c = DesugarCollections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hrz) {
            return this.b.equals(((hrz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.b) + "}";
    }
}
