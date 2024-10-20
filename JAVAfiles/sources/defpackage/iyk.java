package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iyk extends iyu {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.conversation_settings_activity_gm3);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("conversation_id");
            stringExtra.getClass();
            ConversationIdType b = ruy.b(stringExtra);
            boolean booleanExtra = getIntent().getBooleanExtra("is_group_conversation", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_rcs_conversation", false);
            boolean booleanExtra3 = getIntent().getBooleanExtra("is_e2ee_rcs_conversation", false);
            boolean booleanExtra4 = getIntent().getBooleanExtra("has_been_e2ee", false);
            int intExtra = getIntent().getIntExtra("conversation_state", 0);
            int intExtra2 = getIntent().getIntExtra("conversation_send_mode", 0);
            int intExtra3 = getIntent().getIntExtra("conversation_settings_launch_source", 0);
            qpd b2 = qpd.b(getIntent().getIntExtra("conversation_error_state", 0));
            if (b2 == null) {
                b2 = qpd.NONE;
            }
            xze xzeVar = iyn.a;
            aozy createBuilder = iym.a.createBuilder();
            String a = b.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            a.getClass();
            ((iym) apagVar).b = a;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            ((iym) apagVar2).c = booleanExtra;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            ((iym) apagVar3).d = booleanExtra2;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            ((iym) apagVar4).e = intExtra;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            ((iym) createBuilder.b).f = b2.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar5 = createBuilder.b;
            ((iym) apagVar5).g = booleanExtra3;
            if (!apagVar5.isMutable()) {
                createBuilder.u();
            }
            apag apagVar6 = createBuilder.b;
            ((iym) apagVar6).h = booleanExtra4;
            if (!apagVar6.isMutable()) {
                createBuilder.u();
            }
            apag apagVar7 = createBuilder.b;
            ((iym) apagVar7).i = intExtra2;
            if (!apagVar7.isMutable()) {
                createBuilder.u();
            }
            ((iym) createBuilder.b).j = intExtra3;
            cg z = z((iym) createBuilder.s());
            bd bdVar = new bd(a());
            bdVar.v(R.id.fragment_container, z, "settings");
            bdVar.b();
        }
        en j = j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar eZ = eZ();
        if (eZ != null) {
            eZ.s(new jh(this, 20, null));
        }
    }

    protected abstract cg z(iym iymVar);
}
