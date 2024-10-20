package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvh extends LinearLayoutManager {
    final /* synthetic */ kvw a;

    public kvh(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean ah() {
        return this.a.aL;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final nx f() {
        return new nx(-1, -2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean v() {
        return false;
    }
}
