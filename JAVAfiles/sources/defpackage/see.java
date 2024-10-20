package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class see extends agpc {
    public see(String[] strArr) {
        super("remote_user_id_to_registration_id JOIN remote_registrations_table ON (remote_registrations_table.tachyon_registration_id=remote_user_id_to_registration_id.tachyon_registration_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sed b() {
        l();
        return new sed(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sef());
        k(new agpw((sef) apply));
    }
}
