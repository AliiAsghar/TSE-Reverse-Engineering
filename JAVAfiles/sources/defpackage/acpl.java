package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpl extends ArrayList {
    private static final long serialVersionUID = -2638269606726558526L;
    public acpg a;

    public acpl(acpg acpgVar) {
        acpgVar.getClass();
        this.a = acpgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional a(String str, yjr yjrVar) {
        String k = adwf.k(str, yjrVar);
        int size = size();
        for (int i = 0; i < size; i++) {
            acpk acpkVar = (acpk) get(i);
            String str2 = acpkVar.g;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(k) && str2.contains(k)) {
                return Optional.of(acpkVar);
            }
        }
        return Optional.empty();
    }

    public final boolean b() {
        if (this.a == acpg.NONE) {
            advr.q("Invalid user list. State is NONE.", new Object[0]);
            return false;
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof acpl)) {
            acpl acplVar = (acpl) obj;
            if (this.a == acplVar.a) {
                return super.equals(acplVar);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + ", Elements: " + Arrays.toString(toArray());
    }
}
