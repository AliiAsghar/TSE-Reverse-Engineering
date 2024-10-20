package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juw {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider");
    private final Map b;
    private final Map c;
    private final Context d;
    private final armf e;
    private final qdq f;

    public juw(Map map, Map map2, Context context, qdq qdqVar, @nwv armf armfVar) {
        map.getClass();
        context.getClass();
        qdqVar.getClass();
        armfVar.getClass();
        this.b = map;
        this.c = map2;
        this.d = context;
        this.f = qdqVar;
        this.e = armfVar;
    }

    private final void c(List list, jus jusVar) {
        juv juvVar = (juv) this.b.get(jusVar.getClass());
        if (juvVar == null) {
            return;
        }
        jui juiVar = new jui((jgq) ((ksb) this.f.a).a.a.ct.b(), juvVar, jusVar);
        if (juiVar.e()) {
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "addShortcut", 64, "ShortcutsConfigurationProvider.kt")).t("Showing %s shortcut.", this.d.getString(juiVar.a()));
            list.add(new afxc(juiVar.a(), juiVar.b(), juiVar.c(), new jpi(this.d, juiVar, 5, null), 4));
            return;
        }
        alvw d2 = a.d();
        d2.X(alwp.a, "BugleComposeRow2");
        ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "addShortcut", 67, "ShortcutsConfigurationProvider.kt")).t("Hiding %s shortcut.", this.d.getString(juiVar.a()));
    }

    public final afxe a(boolean z) {
        Integer num;
        if (this.c.containsKey(zfr.c)) {
            num = Integer.valueOf(R.drawable.shortcuts_screen_background);
        } else {
            num = null;
        }
        aron aronVar = new aron((byte[]) null);
        if (!z) {
            c(aronVar, jul.a);
            c(aronVar, jum.a);
            c(aronVar, jur.a);
            c(aronVar, juo.a);
            c(aronVar, juk.a);
        }
        c(aronVar, jun.a);
        if (!z) {
            c(aronVar, juj.a);
            c(aronVar, jup.a);
            if (((Boolean) this.e.b()).booleanValue()) {
                c(aronVar, juq.a);
            }
        }
        return new afxe(aqjn.x(aronVar), num);
    }
}
