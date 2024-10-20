package defpackage;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationFragment;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajs {
    public final DebugMobileConfigurationFragment a;
    public final armf b;
    public final armf c;
    public final armf d;
    public Set e;
    public final ConcurrentHashMap f;
    private final arwe g;

    public aajs(DebugMobileConfigurationFragment debugMobileConfigurationFragment, armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.a = debugMobileConfigurationFragment;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.g = arweVar;
        this.e = arnx.a;
        this.f = new ConcurrentHashMap();
    }

    public final RadioGroup a() {
        View findViewById = this.a.L().findViewById(R.id.sims_radio_group);
        findViewById.getClass();
        return (RadioGroup) findViewById;
    }

    public final TextView b() {
        View findViewById = this.a.L().findViewById(R.id.flag_values);
        findViewById.getClass();
        return (TextView) findViewById;
    }

    public final void c(String str) {
        qjh.l(this.g, null, new aafa(this, str, (arpe) null, 3), 3);
    }
}
