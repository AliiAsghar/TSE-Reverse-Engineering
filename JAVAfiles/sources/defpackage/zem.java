package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zem {
    public final List a;
    public final ChipData b;
    public final ChipData c;
    public final zep d;
    public final List e;
    private final Set f;

    public zem(List list, Set set, ChipData chipData, ChipData chipData2, zep zepVar) {
        zepVar.getClass();
        this.a = list;
        this.f = set;
        this.b = chipData;
        this.c = chipData2;
        this.d = zepVar;
        if (!list.isEmpty() && ((ChipData) list.get(0)).e) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ChipData) obj).e) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.e = list;
    }

    public final boolean a(msh mshVar) {
        mshVar.getClass();
        if (!this.f.isEmpty()) {
            return this.f.contains(mshVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [msh, java.lang.Object] */
    public final boolean b(mkh mkhVar) {
        alur it = mkhVar.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (a(((agoe) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zem)) {
            return false;
        }
        zem zemVar = (zem) obj;
        if (d.F(this.a, zemVar.a) && d.F(this.f, zemVar.f) && d.F(this.b, zemVar.b) && d.F(this.c, zemVar.c) && this.d == zemVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.f.hashCode();
        ChipData chipData = this.b;
        int i = 0;
        if (chipData == null) {
            hashCode = 0;
        } else {
            hashCode = chipData.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        ChipData chipData2 = this.c;
        if (chipData2 != null) {
            i = chipData2.hashCode();
        }
        return ((i2 + i) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.f + ", lastAddedChip=" + this.b + ", lastRemovedChip=" + this.c + ", mode=" + this.d + ")";
    }
}
