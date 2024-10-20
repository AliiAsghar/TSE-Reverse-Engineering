package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment;
import com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajbk implements aizn {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajbk(Object obj, String str, int i) {
        this.c = i;
        this.b = obj;
        this.a = str;
    }

    @Override // defpackage.aizn
    public final void a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                asgf asgfVar = new asgf();
                SystemInfoDialogFragment systemInfoDialogFragment = new SystemInfoDialogFragment();
                Bundle bundle = new Bundle(2);
                String str = this.a;
                bundle.putString("EXTRA_ACCOUNT_NAME", str);
                aiyv aiyvVar = (aiyv) this.b;
                bundle.putBundle("EXTRA_PSD_BUNDLE", aizr.b(aiyvVar.f.c));
                systemInfoDialogFragment.ak(bundle);
                da daVar = aiyvVar.m;
                systemInfoDialogFragment.p(daVar, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
                daVar.ag();
                ahnz.J(asgfVar, aiyvVar.a(), str);
                return;
            }
            asgf asgfVar2 = new asgf();
            ajap ajapVar = (ajap) this.b;
            Activity activity = ajapVar.e;
            boolean z = activity instanceof cj;
            String str2 = this.a;
            if (z) {
                da a = ((cj) activity).a();
                SystemInfoDialogFragment systemInfoDialogFragment2 = new SystemInfoDialogFragment();
                Bundle bundle2 = new Bundle(2);
                bundle2.putString("EXTRA_ACCOUNT_NAME", str2);
                bundle2.putBundle("EXTRA_PSD_BUNDLE", aizr.b(ajapVar.c.c));
                systemInfoDialogFragment2.ak(bundle2);
                systemInfoDialogFragment2.p(a, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
                a.ag();
            } else {
                FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
                PlatformSystemInfoDialogFragment platformSystemInfoDialogFragment = new PlatformSystemInfoDialogFragment();
                Bundle bundle3 = new Bundle(2);
                bundle3.putString("EXTRA_ACCOUNT_NAME", str2);
                bundle3.putBundle("EXTRA_PSD_BUNDLE", aizr.b(ajapVar.c.c));
                platformSystemInfoDialogFragment.setArguments(bundle3);
                beginTransaction.add(platformSystemInfoDialogFragment, "com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment");
                beginTransaction.commitAllowingStateLoss();
            }
            ahnz.J(asgfVar2, ajapVar.d, str2);
            return;
        }
        asgf asgfVar3 = new asgf();
        SystemInfoDialogFragment systemInfoDialogFragment3 = new SystemInfoDialogFragment();
        Bundle bundle4 = new Bundle(2);
        String str3 = this.a;
        bundle4.putString("EXTRA_ACCOUNT_NAME", str3);
        ajbl ajblVar = (ajbl) this.b;
        bundle4.putBundle("EXTRA_PSD_BUNDLE", aizr.b(ajblVar.e.c));
        systemInfoDialogFragment3.ak(bundle4);
        da daVar2 = ajblVar.w;
        systemInfoDialogFragment3.p(daVar2, "com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment");
        daVar2.ag();
        ahnz.J(asgfVar3, ajblVar.u, str3);
    }
}
