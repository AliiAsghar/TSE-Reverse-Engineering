package com.google.android.apps.messaging.ui.conversation.toolstone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import defpackage.aack;
import defpackage.aacl;
import defpackage.aagh;
import defpackage.aahq;
import defpackage.aahr;
import defpackage.aajq;
import defpackage.ahmn;
import defpackage.akkc;
import defpackage.armf;
import defpackage.arrj;
import defpackage.arro;
import defpackage.byu;
import defpackage.cav;
import defpackage.cdj;
import defpackage.keh;
import defpackage.rry;
import defpackage.utz;
import defpackage.vid;
import defpackage.xvy;
import defpackage.zzq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationToolstoneView extends aahq implements aacl<ConversationToolstoneView> {
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public rry e;
    private xvy f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationToolstoneView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // defpackage.aacl
    public final rry c() {
        return this.e;
    }

    @Override // defpackage.aacl
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        obj.getClass();
        throw new UnsupportedOperationException("ConversationToolstoneView does not support bindPayload().");
    }

    public final armf f() {
        armf armfVar = this.a;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("composeTraceCreation");
        return null;
    }

    @Override // defpackage.aacl
    public final void g(rry rryVar, boolean z, boolean z2) {
        rryVar.getClass();
        if (((Boolean) ((utz) aagh.b.get()).e()).booleanValue()) {
            this.e = rryVar;
            xvy xvyVar = this.f;
            aahr aahrVar = null;
            if (xvyVar == null) {
                arro.b("toolstoneComposeView");
                xvyVar = null;
            }
            ComposeView composeView = (ComposeView) xvyVar.b();
            armf armfVar = this.c;
            if (armfVar == null) {
                arro.b("toolstoneUiDataFactory");
                armfVar = null;
            }
            aajq aajqVar = (aajq) armfVar.b();
            int f = this.e.f();
            if (f != 232) {
                if (f == 251) {
                    aahrVar = aajqVar.a();
                }
            } else {
                aahrVar = aajqVar.b();
            }
            aahr aahrVar2 = aahrVar;
            if (aahrVar2 != null) {
                composeView.a(new cdj(-529844587, true, new keh((Object) aahrVar2, (Object) new byu(new akkc((ahmn) f().b(), "Toolstone.onCloseClick", new zzq(this, 8), 2), cav.a), (Object) new byu(new akkc((ahmn) f().b(), "Toolstone.onLinkClick", new zzq(this, 9), 2), cav.a), 8, (byte[]) null)));
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = new xvy(this, R.id.toolstone_stub, R.id.toolstone_inflated);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationToolstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        armf armfVar = this.b;
        if (armfVar == null) {
            arro.b("conversationMessageDataFactory");
            armfVar = null;
        }
        this.e = ((vid) armfVar.b()).a();
    }

    public /* synthetic */ ConversationToolstoneView(Context context, AttributeSet attributeSet, int i, arrj arrjVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.aacv
    public final void b() {
    }

    @Override // defpackage.aacl
    public final void e(aack aackVar) {
    }
}
