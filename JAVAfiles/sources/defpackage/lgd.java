package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgd {
    private static final xze d = xze.g("BugleMultiShare", "ChipTrackerImpl");
    public final LinkedHashMap a;
    public final Object b;
    public final ascd c;
    private final Context e;
    private final armf f;
    private final zge g;

    public lgd(Context context, armf armfVar, zge zgeVar, eog eogVar) {
        LinkedHashMap linkedHashMap;
        ArrayList<ChipData> parcelableArrayList;
        context.getClass();
        armfVar.getClass();
        zgeVar.getClass();
        eogVar.getClass();
        this.e = context;
        this.f = armfVar;
        this.g = zgeVar;
        this.b = new Object();
        Bundle bundle = (Bundle) eogVar.a("chip_bundle");
        if (bundle != null) {
            if (yhx.f) {
                parcelableArrayList = bundle.getParcelableArrayList("identities", ChipData.class);
            } else {
                parcelableArrayList = bundle.getParcelableArrayList("identities");
            }
            linkedHashMap = new LinkedHashMap();
            if (parcelableArrayList != null) {
                for (ChipData chipData : parcelableArrayList) {
                    linkedHashMap.put(chipData.a, chipData);
                }
            }
        } else {
            List<ChipData> list = (List) eogVar.a("identities");
            linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (ChipData chipData2 : list) {
                    linkedHashMap.put(chipData2.a, chipData2);
                }
            }
        }
        this.a = linkedHashMap;
        Collection values = linkedHashMap.values();
        values.getClass();
        List ax = aqjn.ax(values);
        Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        this.c = ascy.a(new lge(ax, alzz.bd(keySet), 12));
        eogVar.d("chip_bundle", new cp(this, 4));
    }

    public final void a(ChipData chipData) {
        chipData.getClass();
        synchronized (this.b) {
            ChipData chipData2 = null;
            if (((ChipData) this.a.get(chipData.a)) != null) {
                xyo c = d.c();
                c.H("chip removed");
                c.q();
                chipData2 = chipData;
                chipData = null;
            } else if (this.a.size() <= ((Number) this.f.b()).longValue()) {
                this.a.put(chipData.a, chipData);
                xyo c2 = d.c();
                c2.H("chip added");
                c2.q();
            } else {
                zge zgeVar = this.g;
                String string = this.e.getString(R.string.multi_share_max_recipient_reached, this.f.b());
                string.getClass();
                zgeVar.a(string);
                return;
            }
            ascd ascdVar = this.c;
            Collection values = this.a.values();
            values.getClass();
            List ax = aqjn.ax(values);
            Set keySet = this.a.keySet();
            keySet.getClass();
            ascdVar.f(new lge(ax, alzz.bd(keySet), chipData, chipData2));
        }
    }

    public final lge b() {
        return (lge) this.c.c();
    }
}
