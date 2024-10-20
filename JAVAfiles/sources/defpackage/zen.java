package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zen {
    public static final xze a = xze.g("BugleContacts", "ContactSelectionTrackerImpl");
    public final LinkedHashMap b;
    public final Object c;
    public zep d;
    public final ascd e;

    public zen(eog eogVar) {
        zep zepVar;
        int ordinal;
        ArrayList<ChipData> parcelableArrayList;
        eogVar.getClass();
        this.c = new Object();
        Bundle bundle = (Bundle) eogVar.a("contact_selection_bundle");
        Integer num = (Integer) eogVar.a("selection_mode");
        if (bundle != null) {
            this.d = yzc.v(bundle.getInt("selection_mode"));
            if (yhx.f) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelableArrayList = bundle.getParcelableArrayList("identities", ChipData.class);
                } else {
                    parcelableArrayList = bundle.getParcelableArrayList("identities");
                }
            } else {
                parcelableArrayList = bundle.getParcelableArrayList("identities");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (parcelableArrayList != null) {
                for (ChipData chipData : parcelableArrayList) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
            this.b = linkedHashMap;
            f("initial mode from bundle: ");
        } else if (num != null) {
            Integer num2 = (Integer) eogVar.a("selection_mode");
            if (num2 != null) {
                ordinal = num2.intValue();
            } else {
                ordinal = zep.a.ordinal();
            }
            this.d = yzc.v(ordinal);
            List<ChipData> list = (List) eogVar.a("identities");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap2.put(chipData2.a, chipData2);
                }
            }
            this.b = linkedHashMap2;
            f("initial mode from defaultMode: ");
        } else {
            if (((Boolean) yyv.b.e()).booleanValue()) {
                zepVar = zep.c;
            } else {
                zepVar = zep.a;
            }
            this.d = zepVar;
            this.b = new LinkedHashMap();
            f("initial mode: ");
        }
        Collection values = this.b.values();
        values.getClass();
        List ax = aqjn.ax(values);
        Set keySet = this.b.keySet();
        keySet.getClass();
        this.e = ascy.a(new zem(ax, alzz.bd(keySet), null, null, this.d));
        eogVar.d("contact_selection_bundle", new cp(this, 6));
    }

    private final void f(String str) {
        xyo c = a.c();
        c.H(str);
        c.H(this.d);
        c.H("selected count: ");
        c.F(this.b.size());
        c.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(ChipData chipData, ChipData chipData2) {
        Collection values = this.b.values();
        values.getClass();
        List ax = aqjn.ax(values);
        Set keySet = this.b.keySet();
        keySet.getClass();
        this.e.f(new zem(ax, alzz.bd(keySet), chipData, chipData2, this.d));
    }

    public final void a() {
        Set entrySet = this.b.entrySet();
        entrySet.getClass();
        aqjn.P(entrySet, yzm.h, true);
    }

    public final void b(ChipData chipData) {
        chipData.getClass();
        synchronized (this.c) {
            ChipData chipData2 = (ChipData) this.b.get(chipData.a);
            if (chipData2 != null && chipData2.e) {
                xyo c = a.c();
                c.o(chipData.a);
                c.H("preselected contact clicked");
                c.q();
                return;
            }
            ChipData chipData3 = null;
            if (chipData2 != null) {
                xyo c2 = a.c();
                c2.o(chipData.a);
                c2.H("removing selection chip");
                c2.q();
                this.b.remove(chipData.a);
                chipData3 = chipData;
                chipData = null;
            } else {
                xyo c3 = a.c();
                c3.o(chipData.a);
                c3.H("adding selection chip");
                c3.q();
                this.b.put(chipData.a, chipData);
            }
            g(chipData, chipData3);
        }
    }

    public final void c(zep zepVar) {
        zepVar.getClass();
        synchronized (this.c) {
            zep zepVar2 = this.d;
            if (zepVar != zepVar2) {
                zep zepVar3 = zep.a;
                if ((zepVar2 == zepVar3 && zepVar == zep.b) || (zepVar2 == zep.b && zepVar == zepVar3)) {
                    if (zepVar == zepVar3) {
                        a();
                    }
                    a.o("changing selection mode from " + this.d + " to " + zepVar);
                    this.d = zepVar;
                    g(null, null);
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final zem d() {
        return (zem) this.e.c();
    }
}
