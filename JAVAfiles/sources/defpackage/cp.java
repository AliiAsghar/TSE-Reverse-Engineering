package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cp implements gjy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cp(ex exVar, int i) {
        this.b = i;
        this.a = exVar;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ascd] */
    @Override // defpackage.gjy
    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2;
        switch (this.b) {
            case 0:
                return ((da) this.a).a();
            case 1:
                cj cjVar = (cj) this.a;
                cjVar.f();
                cjVar.a.e(enf.ON_STOP);
                return new Bundle();
            case 2:
                Bundle bundle3 = new Bundle();
                ((ex) this.a).k();
                return bundle3;
            case 3:
                Bundle bundle4 = new Bundle();
                sb sbVar = ((re) this.a).g;
                bundle4.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(sbVar.b.values()));
                bundle4.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(sbVar.b.keySet()));
                bundle4.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(sbVar.c));
                bundle4.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(sbVar.f));
                return bundle4;
            case 4:
                Object obj = this.a;
                synchronized (((lgd) obj).b) {
                    Collection values = ((lgd) obj).a.values();
                    values.getClass();
                    List ax = aqjn.ax(values);
                    bundle = new Bundle();
                    bundle.putParcelableArrayList("identities", new ArrayList<>(ax));
                }
                return bundle;
            case 5:
                Bundle bundle5 = new Bundle();
                bundle5.putLong("conversation_list_limit_key", ((Number) ((mlt) this.a).j.c()).longValue());
                return bundle5;
            case 6:
                Object obj2 = this.a;
                synchronized (((zen) obj2).c) {
                    zep zepVar = ((zen) obj2).d;
                    Collection values2 = ((zen) obj2).b.values();
                    values2.getClass();
                    List ax2 = aqjn.ax(values2);
                    zepVar.getClass();
                    bundle2 = new Bundle();
                    bundle2.putInt("selection_mode", zepVar.ordinal());
                    if (zepVar != zep.a) {
                        bundle2.putParcelableArrayList("identities", new ArrayList<>(ax2));
                    }
                }
                return bundle2;
            case 7:
                Bundle bundle6 = new Bundle();
                ajyr ajyrVar = (ajyr) this.a;
                bundle6.putInt("state_account_id", ajyrVar.b);
                aowt.i(bundle6, "state_account_info", ajyrVar.c);
                bundle6.putInt("state_account_state", ajyrVar.d);
                bundle6.putBoolean("tiktok_accounts_disabled", ajyrVar.a);
                return bundle6;
            case 8:
                Bundle bundle7 = new Bundle();
                ajyv ajyvVar = (ajyv) this.a;
                bundle7.putInt("state_account_id", ajyvVar.a);
                aowt.i(bundle7, "state_account_info", ajyvVar.b);
                bundle7.putInt("state_account_state", ajyvVar.c);
                bundle7.putBoolean("tiktok_accounts_disabled", ajyvVar.d);
                return bundle7;
            case 9:
                Bundle bundle8 = new Bundle();
                ajyy ajyyVar = (ajyy) this.a;
                ajyyVar.a.f(bundle8);
                ajyo ajyoVar = ajyyVar.b;
                if (ajyoVar != null) {
                    bundle8.putInt("KSCH$AC$callbacks_id", ajyoVar.a);
                    bundle8.putInt("KSCH$AC$callbacks_state", ajyoVar.b);
                }
                return bundle8;
            default:
                Bundle bundle9 = new Bundle();
                akbs akbsVar = (akbs) this.a;
                Set set = akbsVar.c;
                bundle9.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new akbu[set.size()]));
                bundle9.putInt("last_process_id", akbsVar.d);
                akbsVar.b.f(bundle9);
                return bundle9;
        }
    }

    public /* synthetic */ cp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
