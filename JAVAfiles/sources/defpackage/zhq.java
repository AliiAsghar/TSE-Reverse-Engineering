package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SwipeActionPreference;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zhq implements akgs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zhq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akgs
    public final /* synthetic */ void a(Throwable th) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                akec.l(th);
                                return;
                            } else {
                                akec.l(th);
                                return;
                            }
                        }
                        akec.l(th);
                        return;
                    }
                    akec.l(th);
                    return;
                }
                akec.l(th);
                return;
            }
            akec.l(th);
            return;
        }
        akec.l(th);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, arqr] */
    @Override // defpackage.akgs
    public final void b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a.a(obj);
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            this.a.a(obj);
                            return;
                        } else {
                            this.a.a(obj);
                            return;
                        }
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SwitchPreferenceCompat switchPreferenceCompat = ((znr) this.a).f;
                    if (switchPreferenceCompat != null) {
                        switchPreferenceCompat.G(true);
                        switchPreferenceCompat.N(true);
                        switchPreferenceCompat.k(booleanValue);
                        return;
                    }
                    return;
                }
                zmx zmxVar = (zmx) this.a;
                zmv zmvVar = zmxVar.a;
                zmq zmqVar = (zmq) obj;
                SwipeActionPreference swipeActionPreference = (SwipeActionPreference) zmvVar.a(zmvVar.S(R.string.swipe_left_key));
                zmv zmvVar2 = zmxVar.a;
                SwipeActionPreference swipeActionPreference2 = (SwipeActionPreference) zmvVar2.a(zmvVar2.S(R.string.swipe_right_key));
                zmxVar.f = zmqVar;
                if (swipeActionPreference != null) {
                    zmp b = zmp.b(zmqVar.c);
                    if (b == null) {
                        b = zmp.ARCHIVE;
                    }
                    swipeActionPreference.k(b);
                }
                if (swipeActionPreference2 != null) {
                    zmp b2 = zmp.b(zmqVar.d);
                    if (b2 == null) {
                        b2 = zmp.ARCHIVE;
                    }
                    swipeActionPreference2.k(b2);
                    return;
                }
                return;
            }
            zmq zmqVar2 = (zmq) ((Optional) obj).orElse(null);
            if (zmqVar2 != null) {
                las lasVar = (las) this.a;
                lasVar.h = zmqVar2;
                Map map = (Map) lasVar.c.b();
                zmp b3 = zmp.b(lasVar.h.c);
                if (b3 == null) {
                    b3 = zmp.ARCHIVE;
                }
                lay layVar = (lay) map.get(b3);
                if (layVar != null) {
                    layVar.a().a();
                }
                Map map2 = (Map) lasVar.c.b();
                zmp b4 = zmp.b(lasVar.h.d);
                if (b4 == null) {
                    b4 = zmp.ARCHIVE;
                }
                lay layVar2 = (lay) map2.get(b4);
                if (layVar2 != null) {
                    layVar2.a().a();
                    return;
                }
                return;
            }
            return;
        }
        zmq zmqVar3 = (zmq) obj;
        zhw zhwVar = (zhw) this.a;
        Preference preference = (Preference) zhwVar.al.get();
        Context x = zhwVar.f.x();
        x.getClass();
        akfc akfcVar = zmt.a;
        zmp b5 = zmp.b(zmqVar3.c);
        if (b5 == null) {
            b5 = zmp.ARCHIVE;
        }
        zmp b6 = zmp.b(zmqVar3.d);
        if (b6 == null) {
            b6 = zmp.ARCHIVE;
        }
        String a = zmt.a(x, b6);
        String a2 = zmt.a(x, b5);
        preference.n(x.getString(R.string.swipe_actions_summary_right, a) + "\n" + x.getString(R.string.swipe_actions_summary_left, a2));
    }
}
