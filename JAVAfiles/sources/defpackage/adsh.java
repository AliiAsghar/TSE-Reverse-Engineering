package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsh {
    public final int a;
    public final long b;
    public final long c;
    public Optional d = Optional.empty();
    public final Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();

    public adsh(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void a(GroupInfo groupInfo) {
        this.f = Optional.of(groupInfo);
    }

    public final void b(UserInfo userInfo) {
        this.d = Optional.of(userInfo);
    }
}
