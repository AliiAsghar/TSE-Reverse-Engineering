package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import defpackage.aklx;
import defpackage.zhw;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zho extends zmz implements akkh, apxq, akkf, aklk, akrw {
    private zhw aj;
    private Context ak;
    private final eno al = new eno(this);
    private final akqf an = new akqf(this);
    private boolean ao;

    @Deprecated
    public zho() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zhw.class;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View K = super.K(layoutInflater, viewGroup, bundle);
            akqj.p();
            return K;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.al;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void W(Bundle bundle) {
        this.an.k();
        try {
            super.W(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.an.f();
        try {
            super.X(i, i2, intent);
            zhw E = E();
            if (i == 1001) {
                ((mho) E.j.b()).as(null, E.i.e());
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zmz, defpackage.aiua, defpackage.cg
    public final void Y(Activity activity) {
        this.an.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.an.j();
        try {
            boolean aC = super.aC(menuItem);
            j.close();
            return aC;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        this.an.h(i, i2);
        akqj.p();
    }

    @Override // defpackage.gfl, defpackage.gft
    public final boolean aM(Preference preference) {
        zhw E = E();
        if (Objects.equals(preference.s, E.W)) {
            Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
            String f = E.h.f(E.W, null);
            if (f != null) {
                if (f.length() == 0) {
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", (Parcelable) null);
                } else {
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(f));
                }
            } else {
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
            }
            E.f.startActivityForResult(intent, 1003);
            return true;
        }
        return super.aM(preference);
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [armf, java.lang.Object] */
    @Override // defpackage.gfl
    public final void aN(Bundle bundle) {
        zhw E = E();
        E.e.c(bundle);
        E.f.b.f("bugle");
        E.f.fR(R.xml.preferences_application);
        E.f.d().ag();
        E.V = E.a(R.string.notifications_pref_key);
        E.U = E.f.S(R.string.notifications_enabled_pref_key);
        E.af = E.a(R.string.notifications_remind_action_pref_key);
        int i = 6;
        E.V.ifPresent(new ytq(E, i));
        E.W = E.f.S(R.string.notification_sound_pref_key);
        E.X = E.b(E.W);
        E.Z = E.b(E.f.S(R.string.smarts_settings_parent_pref));
        E.aa = E.b(E.f.S(R.string.rich_cards_settings_root_id));
        E.ab = E.b(E.f.S(R.string.vsms_settings_root_id));
        E.ac = E.b(E.f.S(R.string.bubble_settings_pref_key));
        E.ad = E.b(E.f.S(R.string.rcs_pref_key));
        Optional b = E.b(E.f.S(R.string.super_sort_pref_key));
        int i2 = 11;
        if (((Boolean) lqd.a.e()).booleanValue() && ((Optional) ((apxx) E.v).a).isPresent()) {
            ((Optional) ((apxx) E.v).a).ifPresent(new xyh(i2));
        } else {
            zhw.a.o("Message organization entry point absent, removing message organization preference");
            b.ifPresent(new zhp(E, i2));
        }
        E.ae = E.b(E.f.S(R.string.federated_learning_settings_parent_pref_key));
        E.e(E.f.d().q());
        E.Y = E.b(E.aq.f());
        E.Y.ifPresent(new ytq(E, 7));
        E.c();
        if (E.o.q()) {
            E.f.fR(R.xml.preferences_application_debug);
        }
        Optional optional = E.Z;
        if (optional != null && optional.isPresent()) {
            ((PreferenceScreen) E.Z.get()).t = ((lzv) E.g.b()).f(E.f.d().j);
        }
        E.b(E.f.S(R.string.hqms_pref_key)).ifPresent(new zhp(E, 5));
        Optional b2 = E.b(E.f.S(R.string.protection_safety_settings_pref_key));
        Optional b3 = E.b(E.f.S(R.string.spam_settings_pref_key));
        int i3 = 9;
        int i4 = 10;
        int i5 = 8;
        if (ymd.b()) {
            b2.ifPresent(new ytq(E, i5));
            b3.ifPresent(new ytq(E, i3));
        } else {
            b3.ifPresent(new ytq(E, i4));
            b2.ifPresent(new ytq(E, i2));
        }
        if (yhx.d) {
            E.ac.ifPresent(new zhp(E, 1));
        }
        Optional optional2 = E.aa;
        if (optional2 != null && optional2.isPresent()) {
            Context context = E.f.d().j;
            if (((Boolean) E.E.b()).booleanValue()) {
                ajwt ajwtVar = E.d;
                Intent p = ((lzv) E.g.b()).p(context);
                ajya.c(p, ajwtVar);
                ((PreferenceScreen) E.aa.get()).t = p;
            } else {
                ((PreferenceScreen) E.aa.get()).t = ((lzv) E.g.b()).p(context);
            }
        }
        Optional optional3 = E.ab;
        int i6 = 2;
        int i7 = 0;
        if (optional3 != null && !optional3.isEmpty()) {
            ((PreferenceScreen) E.ab.get()).t = ((lzv) E.g.b()).s(E.f.d().j);
            ((PreferenceScreen) E.ab.get()).N(false);
            E.as.D(new akfk(E.ar, new ikn(E, 13), "VERIFIED_SMS_CONTENT_KEY", 2), akgd.FEW_SECONDS, new zhv(E));
        } else {
            zhw.a.o("verifiedSmsPreference was not found");
        }
        Optional optional4 = E.ae;
        if (optional4 != null && optional4.isPresent()) {
            if (((Boolean) yig.z.e()).booleanValue() && E.n.isPresent()) {
                ((PreferenceScreen) E.ae.get()).t = ((lzv) E.g.b()).b(E.f.d().j);
            } else {
                E.f.d().af((Preference) E.ae.get());
            }
        }
        Optional b4 = E.b(E.f.S(R.string.advanced_pref_key));
        boolean booleanExtra = E.f.fe().getIntent().getBooleanExtra("top_level_settings", false);
        if (b4.isPresent()) {
            if (booleanExtra) {
                ((PreferenceScreen) b4.get()).t = ((lzv) E.g.b()).j(E.f.d().j);
            } else {
                E.f.d().af((Preference) b4.get());
            }
        }
        E.b(E.f.S(R.string.swipe_action_pref_key)).ifPresent(new zhp(E, i7));
        E.b(E.f.S(R.string.about_app_pref_key)).ifPresent(new zhp(E, i6));
        Optional b5 = E.b(E.f.S(R.string.google_account_pref_key));
        if (!b5.isEmpty()) {
            E.ak = Optional.of(new AtomicReference());
            E.g();
            E.f.d().af((Preference) b5.get());
            akgu akguVar = E.q;
            atsg atsgVar = E.F;
            ajwt ajwtVar2 = E.d;
            ((qif) atsgVar.a.b()).getClass();
            qyo qyoVar = (qyo) atsgVar.b.b();
            qyoVar.getClass();
            ahiy ahiyVar = (ahiy) atsgVar.c.b();
            ahiyVar.getClass();
            ((ahiy) atsgVar.d.b()).getClass();
            arwe arweVar = (arwe) atsgVar.e.b();
            arweVar.getClass();
            akguVar.a(R.id.bnr_ui_data_local_subscription_id, new atse(new atsg(qyoVar, ahiyVar, arweVar, (Optional) ((apxx) atsgVar.f).a, atsgVar.g, ajwtVar2), 0), new isj(E, 8));
        }
        E.ag = E.a(R.string.split_view_pref_key);
        E.ag.ifPresent(new zhp(E, i5));
        E.ah = E.a(R.string.pinch_zoom_pref_key);
        if (!E.ah.isEmpty() && !((Optional) E.y.b()).isEmpty()) {
            if (!E.e.b()) {
                E.f.d().af((Preference) E.ah.get());
            } else {
                ((SwitchPreferenceCompat) E.ah.get()).G(false);
                ((SwitchPreferenceCompat) E.ah.get()).N(false);
                E.as.C(((zxm) ((Optional) E.y.b()).get()).b(), E.A);
                ((SwitchPreferenceCompat) E.ah.get()).n = new akvd(E.u, "ApplicationSettingsFragmentPeer:setupPinchZoomPreference", new lqp(E, i));
            }
        }
        Optional a = E.a(R.string.choose_theme_pref_key);
        a.ifPresent(new zhp(E, i));
        Optional a2 = E.a(R.string.choose_theme_legacy_pref_key);
        a2.ifPresent(new zhp(E, 12));
        E.a(R.string.gemini_screen_pref_key).ifPresent(new zhp(E, i3));
        E.ai = E.a(R.string.vmt_pref_key);
        E.ai.ifPresent(new zhp(E, i4));
        E.am = E.a(R.string.fast_photo_send_pref_key);
        if (!E.am.isEmpty()) {
            ((SwitchPreferenceCompat) E.am.get()).G(false);
            ((SwitchPreferenceCompat) E.am.get()).N(false);
            if (!E.R.a()) {
                E.q.a(R.id.fast_image_sending_setting_subscription_id, new xph((yfr) E.H.b(), 2), new isj(E, 7));
                ((SwitchPreferenceCompat) E.am.get()).n = new akvd(E.u, "ApplicationSettingsFragmentPeer:setupFastImageSendingPreference", new lqp(E, 7));
            }
        }
        E.aj = E.a(R.string.send_sound_pref_key);
        if (!E.aj.isEmpty()) {
            ((Preference) E.aj.get()).L(R.string.incoming_outgoing_sound_pref_title);
        }
        E.an = E.a(R.string.expressive_animations_pref_key);
        if (!E.an.isEmpty()) {
            if (E.O.isEmpty()) {
                E.f.d().af((Preference) E.an.get());
            } else {
                ((SwitchPreferenceCompat) E.an.get()).L(((zhc) E.O.get()).a());
                ((SwitchPreferenceCompat) E.an.get()).G(false);
                ((SwitchPreferenceCompat) E.an.get()).N(false);
                E.q.a(R.id.expressive_animations_settings_subscription_id, ((zhc) E.O.get()).b(), new isj(E, 6));
                ((SwitchPreferenceCompat) E.an.get()).n = new akvd(E.u, "ApplicationSettingsFragmentPeer:setupExpressiveAnimationsPreference", new lqp(E, 4));
            }
        }
        zho zhoVar = E.f;
        Preference a3 = zhoVar.a(zhoVar.S(R.string.profile_pref_key));
        a3.getClass();
        E.as.C(((zhl) E.J.b()).a(E.d), new zhs(E, a3));
    }

    @Override // defpackage.akkh
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final zhw E() {
        zhw zhwVar = this.aj;
        if (zhwVar != null) {
            if (!this.ao) {
                return zhwVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zmz
    protected final /* bridge */ /* synthetic */ aklw aQ() {
        return new akls(this, true);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ak == null) {
            this.ak = new aklm(this, super.x());
        }
        return this.ak;
    }

    @Override // defpackage.akrw
    public final aktr aW() {
        return this.an.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.an.e(aktrVar, z);
    }

    @Override // defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.an.b = aktrVar;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void aa() {
        aksa b = this.an.b();
        try {
            super.aa();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void ad() {
        this.an.k();
        try {
            super.ad();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:9:0x003c, B:11:0x004a, B:12:0x008e, B:14:0x0092, B:17:0x0099, B:19:0x00a1, B:20:0x00ec, B:22:0x00f5, B:25:0x00fc, B:26:0x0115, B:28:0x0119, B:31:0x0120, B:32:0x0146, B:34:0x0154, B:36:0x0158, B:39:0x015f, B:40:0x0171, B:44:0x013f, B:45:0x010e, B:46:0x00b3, B:48:0x00bb, B:49:0x00d0, B:50:0x00e5, B:51:0x005f, B:53:0x0065, B:54:0x007a, B:55:0x0035), top: B:2:0x0006 }] */
    @Override // defpackage.aiua, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void af() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zho.af():void");
    }

    @Override // defpackage.lzh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.an.k();
        try {
            super.ag(view, bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.lzh
    protected final boolean ba() {
        return true;
    }

    @Override // defpackage.zmz, defpackage.cg
    public final void f(Context context) {
        zho zhoVar = this;
        zhoVar.an.k();
        try {
            if (!zhoVar.ao) {
                super.f(context);
                if (zhoVar.aj == null) {
                    try {
                        Object aS = aS();
                        ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof zho) {
                            zho zhoVar2 = (zho) cgVar;
                            krv krvVar = ((kql) aS).a;
                            apya apyaVar = krvVar.yJ;
                            ykw ykwVar = (ykw) krvVar.av.b();
                            yhu yhuVar = (yhu) ((kql) aS).a.cu.b();
                            krv krvVar2 = ((kql) aS).a;
                            apya apyaVar2 = krvVar2.gD;
                            yju yjuVar = (yju) krvVar2.aL.b();
                            yjr yjrVar = (yjr) ((kql) aS).a.bO.b();
                            krv krvVar3 = ((kql) aS).a;
                            apya apyaVar3 = krvVar3.oC;
                            apya apyaVar4 = krvVar3.eN;
                            ytk ytkVar = (ytk) krvVar3.oj.b();
                            krv krvVar4 = ((kql) aS).a;
                            Optional optional = (Optional) ((apxx) krvVar4.oE).a;
                            yck yckVar = (yck) krvVar4.fa.b();
                            apya apyaVar5 = ((kql) aS).dN;
                            aohs aohsVar = (aohs) ((kql) aS).s.b();
                            akgu akguVar = (akgu) ((kql) aS).u.b();
                            ansy ansyVar = (ansy) ((kql) aS).a.ct.b();
                            akbo akboVar = (akbo) ((kql) aS).e.b();
                            Optional empty = Optional.empty();
                            Optional empty2 = Optional.empty();
                            akvf akvfVar = (akvf) ((kql) aS).dJ.b();
                            adve adveVar = (adve) ((kql) aS).a.vu.b();
                            apya apyaVar6 = ((kql) aS).dO;
                            apya apyaVar7 = ((kql) aS).ej.u;
                            apya apyaVar8 = ((kql) aS).a.bB;
                            try {
                                kor korVar = new kor(Optional.empty(), Optional.empty());
                                apwt a = apxv.a(((kql) aS).bd);
                                krv krvVar5 = ((kql) aS).a;
                                apya apyaVar9 = krvVar5.tE;
                                Optional empty3 = Optional.empty();
                                Optional empty4 = Optional.empty();
                                krv krvVar6 = ((kql) aS).a;
                                atsg atsgVar = new atsg(krvVar6.on, krvVar6.a.b, krvVar6.tE, krvVar6.aC, krvVar6.bQ, ((kql) aS).dP, ((kql) aS).dQ);
                                apya apyaVar10 = ((kql) aS).dR;
                                krv krvVar7 = ((kql) aS).a;
                                krx krxVar = krvVar7.a;
                                apya apyaVar11 = krxVar.er;
                                apya apyaVar12 = ((kql) aS).cz;
                                apya apyaVar13 = krvVar7.eF;
                                apya apyaVar14 = krvVar7.au;
                                apya apyaVar15 = ((kql) aS).cd;
                                zhw zhwVar = new zhw(ajwtVar, zhoVar2, apyaVar, ykwVar, yhuVar, apyaVar2, yjuVar, yjrVar, apyaVar3, apyaVar4, ytkVar, optional, yckVar, apyaVar5, aohsVar, akguVar, ansyVar, akboVar, empty, empty2, akvfVar, adveVar, apyaVar6, apyaVar7, apyaVar8, korVar, a, apyaVar9, empty3, empty4, atsgVar, apyaVar10, apyaVar11, apyaVar12, apyaVar13, apyaVar14, krxVar.et, ((kql) aS).dS, krxVar.eu, ((kql) aS).dT, krvVar7.aC, krvVar7.dq, (Optional) ((apxx) ((kql) aS).dU).a, (Optional) ((apxx) krvVar7.cA).a, krxVar.W());
                                zhoVar = this;
                                zhoVar.aj = zhwVar;
                                zhwVar.at = zhoVar;
                                zhoVar.Z.c(new akli(zhoVar.an, zhoVar.al));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    akqj.p();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, zhw.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = zhoVar.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = zhoVar.an;
                    if (akqfVar.a == null) {
                        akqfVar.e(((akrw) eozVar).aW(), true);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void g(Bundle bundle) {
        armf armfVar;
        this.an.k();
        try {
            super.g(bundle);
            zhw E = E();
            E.s.ifPresent(new zhp(E, 3));
            E.S = new zhw.d();
            E.r.b(E.S);
            E.T = new zhw.a();
            E.r.b(E.T);
            E.al = E.b(E.f.S(R.string.swipe_action_pref_key));
            if (!E.al.isEmpty() && (armfVar = E.G) != null) {
                E.q.a(R.id.swipe_action_settings_summary_subscription_id, new xph((zmt) armfVar.b(), 4), new zhq(E, 0));
            }
            E.ao = E.f.M(new sl(), new yjk(E, 2));
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.an.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void h() {
        aksa b = this.an.b();
        try {
            super.h();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void i() {
        aksa a = this.an.a();
        try {
            super.i();
            this.ao = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void j(Bundle bundle) {
        this.an.k();
        try {
            super.j(bundle);
            E().e.a(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void k() {
        this.an.k();
        try {
            super.k();
            zhw E = E();
            E.f.d().q().registerOnSharedPreferenceChangeListener(E);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void l() {
        this.an.k();
        try {
            super.l();
            zhw E = E();
            E.f.d().q().unregisterOnSharedPreferenceChangeListener(E);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zmz, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
