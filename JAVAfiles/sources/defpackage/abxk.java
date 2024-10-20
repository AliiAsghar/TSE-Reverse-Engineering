package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.DuoKitContainerActivity;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartCallResponse;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abxk implements acim {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ abxk(acit acitVar, Context context, acak acakVar, StartCallRequest startCallRequest, int i) {
        this.e = i;
        this.b = acitVar;
        this.a = context;
        this.c = acakVar;
        this.d = startCallRequest;
    }

    @Override // defpackage.acim
    public final void e(Object obj) {
        boolean z;
        algw i;
        int i2;
        if (this.e != 0) {
            alhp alhpVar = (alhp) this.c;
            alhpVar.f();
            ywh ywhVar = (ywh) ((WearableBindService) this.a).s.b();
            Duration c = alhpVar.c();
            Object obj2 = this.d;
            obj2.getClass();
            Object obj3 = this.b;
            obj3.getClass();
            c.getClass();
            if (!ywhVar.b()) {
                return;
            }
            ywhVar.c(9, (String) obj2, (String) obj3, c, ywh.b);
            return;
        }
        Object obj4 = this.b;
        Object obj5 = this.d;
        abwv abwvVar = (abwv) obj;
        try {
            StartCallResponse startCallResponse = new StartCallResponse();
            DuoId duoId = ((StartCallRequest) obj5).a;
            int i3 = duoId.a;
            Object obj6 = this.c;
            if (i3 == 1) {
                int i4 = ((StartCallRequest) obj5).b;
                if (i4 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(((StartCallRequest) obj5).d)) {
                    i = alfd.a;
                } else {
                    i = algw.i(((StartCallRequest) obj5).d);
                }
                boolean b = abwvVar.b();
                Context context = this.a;
                if (b) {
                    Intent addFlags = new Intent("com.google.android.gms.duokit.action.DUO_CALL").setData(Uri.parse(String.format("%s:%s", "tel", duoId.b))).setClassName(context, DuoKitContainerActivity.class.getName()).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", z).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                    if (i.f()) {
                        addFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) i.b());
                    }
                    context.startActivity(addFlags);
                    aozy createBuilder = apub.a.createBuilder();
                    if (i4 == 1) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apub) createBuilder.b).b = a.ak(i2);
                    apub apubVar = (apub) createBuilder.s();
                    aozy createBuilder2 = apuj.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ((apuj) createBuilder2.b).d = a.av(5);
                    Object obj7 = ((acak) obj6).a;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    obj7.getClass();
                    ((apuj) apagVar).e = (String) obj7;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    ((apuj) createBuilder2.b).f = a.ao(4);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apuj apujVar = (apuj) createBuilder2.b;
                    apubVar.getClass();
                    apujVar.c = apubVar;
                    apujVar.b = 3;
                    ((acak) obj6).d((apuj) createBuilder2.s());
                } else if (((StartCallRequest) obj5).c && !abhx.c(context)) {
                    ((acak) obj6).g(5, 7);
                    abhx.i(context, (acak) obj6, i);
                } else {
                    Log.w("DuoKitStartCall", "Duo installed but can't handle the API");
                    ((acak) obj6).h(5);
                    throw new abwt("Failed to handle the API call");
                }
                ((acit) obj4).b(startCallResponse);
                return;
            }
            Log.w("DuoKitStartCall", "Only call to phone numbers is supported");
            ((acak) obj6).h(5);
            throw new abwt("Only phone number calling is supported.");
        } catch (abwt e) {
            ((acit) obj4).a(e);
        }
    }

    public /* synthetic */ abxk(WearableBindService wearableBindService, alhp alhpVar, String str, String str2, int i) {
        this.e = i;
        this.a = wearableBindService;
        this.c = alhpVar;
        this.d = str;
        this.b = str2;
    }
}
