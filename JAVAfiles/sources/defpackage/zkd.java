package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkd implements wve {
    final /* synthetic */ zke a;

    public zkd(zke zkeVar) {
        this.a = zkeVar;
    }

    @Override // defpackage.wve
    public final Optional a() {
        aozy createBuilder = zkb.a.createBuilder();
        zke zkeVar = this.a;
        Context context = zkeVar.b;
        ykw ykwVar = zkeVar.c;
        String string = context.getString(R.string.auto_retrieve_mms_pref_key);
        if (ykwVar.p(string)) {
            boolean q = ykwVar.q(string, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar = (zkb) createBuilder.b;
            zkbVar.b |= 1;
            zkbVar.c = q;
        }
        String string2 = context.getString(R.string.auto_retrieve_mms_when_roaming_pref_key);
        if (ykwVar.p(string2)) {
            boolean q2 = ykwVar.q(string2, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar2 = (zkb) createBuilder.b;
            zkbVar2.b |= 2;
            zkbVar2.d = q2;
        }
        String string3 = context.getString(R.string.sms_encoding_pref_key);
        if (ykwVar.p(string3)) {
            boolean q3 = ykwVar.q(string3, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar3 = (zkb) createBuilder.b;
            zkbVar3.b |= 4;
            zkbVar3.e = q3;
        }
        String string4 = context.getString(R.string.delivery_reports_pref_key);
        if (ykwVar.p(string4)) {
            boolean q4 = ykwVar.q(string4, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar4 = (zkb) createBuilder.b;
            zkbVar4.b |= 8;
            zkbVar4.f = q4;
        }
        String string5 = context.getString(R.string.wap_push_si_pref_key);
        if (ykwVar.p(string5)) {
            boolean q5 = ykwVar.q(string5, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar5 = (zkb) createBuilder.b;
            zkbVar5.b |= 16;
            zkbVar5.g = q5;
        }
        String string6 = context.getString(R.string.mms_phone_number_pref_key);
        if (ykwVar.p(string6)) {
            String f = ykwVar.f(string6, "");
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar6 = (zkb) createBuilder.b;
            f.getClass();
            zkbVar6.b |= 32;
            zkbVar6.h = f;
        }
        String string7 = context.getString(R.string.group_mms_pref_key);
        if (ykwVar.p(string7)) {
            boolean q6 = ykwVar.q(string7, false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            zkb zkbVar7 = (zkb) createBuilder.b;
            zkbVar7.b |= 64;
            zkbVar7.i = q6;
        }
        return Optional.of((zkb) createBuilder.s());
    }

    @Override // defpackage.wve
    public final void b() {
    }

    @Override // defpackage.wvd
    public final /* synthetic */ void c() {
    }
}
