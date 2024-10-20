package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aauq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aauq(abcu abcuVar, Context context, String str, int i) {
        this.d = i;
        this.a = abcuVar;
        this.c = context;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aavb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, com.google.android.gms.wearable.ChannelClient$Channel] */
    /* JADX WARN: Type inference failed for: r4v9, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        acir b;
        int i = 4;
        Bundle bundle = null;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                aavb aavbVar = ((aava) this.a).g;
                ?? r2 = this.b;
                if (aavbVar == r2) {
                    Camera.Size size = (Camera.Size) this.c;
                    r2.a(size.width, size.height);
                    r2.requestLayout();
                    return;
                }
                return;
            case 1:
                aajv.a("rm ".concat((String) this.a));
                aajv.a("ln -s " + ((String) this.b) + " " + ((String) this.a));
                Toast.makeText((Context) this.c, "link updated to target ".concat((String) this.b), 1).show();
                return;
            case 2:
                aazt aaztVar = (aazt) this.c;
                ((ykw) aaztVar.g.b()).i("manual_msisdn_entered_country_code", ((aoyj) this.a).toByteArray());
                ((ykw) aaztVar.g.b()).l("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(aaztVar.e)), (String) this.b);
                ((wjr) aaztVar.k.b()).l(aaztVar.e, Duration.ZERO, 2, amww.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CONTINUE_BUTTON);
                return;
            case 3:
                xzb.c("Bugle", "send msisdn to provisioning engine");
                ?? r0 = this.b;
                if (!TextUtils.isEmpty(r0)) {
                    ?? r22 = this.c;
                    if (!r22.D()) {
                        Object obj = this.a;
                        String o = r22.o(((Boolean) new msn(16).get()).booleanValue());
                        zrs zrsVar = (zrs) obj;
                        if (((acxv) zrsVar.c.b()).a()) {
                            ((aday) zrsVar.d.b()).s((String) r0, o);
                            return;
                        }
                        Object obj2 = zrsVar.a;
                        adnu.a();
                        adnu.p((Context) obj2, (String) r0, o);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xzb.c("Bugle", "send msisdn to provisioning engine");
                ?? r02 = this.a;
                if (!TextUtils.isEmpty(r02)) {
                    ?? r23 = this.b;
                    if (!TextUtils.isEmpty(r23)) {
                        zrs zrsVar2 = (zrs) this.c;
                        if (((acxv) zrsVar2.c.b()).a()) {
                            ((aday) zrsVar2.d.b()).s((String) r02, (String) r23);
                            return;
                        } else {
                            Object obj3 = zrsVar2.a;
                            adnu.a();
                            adnu.p((Context) obj3, (String) r02, (String) r23);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                ead$$ExternalSyntheticApiModelOutline0.m343m(((Context) this.c).getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).reportShortcutUsed((String) this.b);
                ((abcu) this.a).k++;
                return;
            case 6:
                Object obj4 = this.a;
                WearableBindService wearableBindService = (WearableBindService) obj4;
                vl vlVar = wearableBindService.b;
                ?? r4 = this.b;
                rrb rrbVar = (rrb) vlVar.remove(r4);
                if (rrbVar != null && rrbVar.g()) {
                    rrbVar.f();
                }
                Object obj5 = this.c;
                rrb rrbVar2 = new rrb();
                Uri uri = (Uri) obj5;
                rra e = new ugi(uri, 250, 250, -1, -1, false, false, false, 0, true).e((Context) obj4, new abdq(wearableBindService, rrbVar2, r4, uri));
                rrbVar2.c(e);
                wearableBindService.b.put(r4, rrbVar2);
                ((uga) wearableBindService.l.b()).b(e);
                return;
            case 7:
                CloudMessage cloudMessage = (CloudMessage) this.a;
                if (TextUtils.isEmpty(cloudMessage.b())) {
                    b = actx.s(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("google.message_id", cloudMessage.b());
                    Integer a = cloudMessage.a();
                    if (a != null) {
                        bundle2.putInt("google.product_id", a.intValue());
                    }
                    Object obj6 = this.c;
                    bundle2.putBoolean("supports_message_handled", true);
                    b = aixx.d((Context) obj6).b(2, bundle2);
                }
                b.n(new sp(12), new uyb(this.b, i));
                return;
            case 8:
                absv absvVar = (absv) this.a;
                if (absvVar.a > 0) {
                    Object obj7 = this.c;
                    Bundle bundle3 = absvVar.b;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.b);
                    }
                    ((abss) obj7).d(bundle);
                }
                if (((absv) this.a).a >= 2) {
                    ((abss) this.c).i();
                }
                if (((absv) this.a).a >= 3) {
                    ((absi) this.c).k();
                }
                if (((absv) this.a).a >= 4) {
                    ((abss) this.c).j();
                    return;
                }
                return;
            case 9:
                ?? r03 = this.b;
                Object obj8 = this.c;
                try {
                    if (((abwb) obj8).b != null) {
                        bArr = ((abwb) obj8).b.snapshot(r03);
                    }
                    if (bArr == null) {
                        ((abwb) obj8).c = abhx.f("Received null");
                        bArr = ((abwb) obj8).c;
                    }
                } catch (Exception e2) {
                    abwb abwbVar = (abwb) obj8;
                    abwbVar.c = abhx.g("Snapshot failed: ".concat(e2.toString()), e2);
                    bArr = abwbVar.c;
                    abwbVar.close();
                }
                ((abwl) this.a).b(bArr);
                return;
            default:
                MessageEventParcelable messageEventParcelable = (MessageEventParcelable) this.b;
                byte[] bArr2 = messageEventParcelable.c;
                ((ackn) this.c).a.d(messageEventParcelable.d, messageEventParcelable.b, bArr2).q(new uyb(this.a, 6));
                return;
        }
    }

    public aauq(absv absvVar, abss abssVar, int i) {
        this.d = i;
        this.c = abssVar;
        this.b = "ConnectionlessLifecycleHelper";
        this.a = absvVar;
    }

    public /* synthetic */ aauq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aauq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ aauq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public aauq(String str, String str2, Context context, int i) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = context;
    }
}
