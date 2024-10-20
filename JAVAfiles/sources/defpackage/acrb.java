package defpackage;

import android.database.ContentObserver;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrb extends ContentObserver {
    final /* synthetic */ acrd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acrb(acrd acrdVar) {
        super(null);
        this.a = acrdVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (!z) {
            boolean isEmpty = TextUtils.isEmpty(this.a.c.h());
            advr.c("User is logged in: %b", Boolean.valueOf(!isEmpty));
            if (!isEmpty) {
                advr.o("Address book has changed, triggering IMS contacts DB sync.", new Object[0]);
                this.a.c();
            }
        }
    }
}
