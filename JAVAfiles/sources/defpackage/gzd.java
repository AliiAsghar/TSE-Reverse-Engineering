package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzd extends ghp {
    public gzd(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.ghp
    protected final /* synthetic */ void b(gkp gkpVar, Object obj) {
        gys gysVar = (gys) obj;
        gkpVar.g(1, gysVar.c);
        gkpVar.e(2, gvf.z(gysVar.d));
        gkpVar.g(3, gysVar.e);
        gkpVar.g(4, gysVar.f);
        gkpVar.c(5, gvf.av(gysVar.g));
        gkpVar.c(6, gvf.av(gysVar.h));
        gkpVar.e(7, gysVar.i);
        gkpVar.e(8, gysVar.j);
        gkpVar.e(9, gysVar.k);
        gkpVar.e(10, gysVar.m);
        gkpVar.e(11, gvf.x(gysVar.n));
        gkpVar.e(12, gysVar.o);
        gkpVar.e(13, gysVar.p);
        gkpVar.e(14, gysVar.q);
        gkpVar.e(15, gysVar.r);
        gkpVar.e(16, gysVar.s ? 1L : 0L);
        gkpVar.e(17, gvf.y(gysVar.t));
        gkpVar.e(18, gysVar.u);
        gkpVar.e(19, gysVar.v);
        gkpVar.e(20, gysVar.w);
        gkpVar.e(21, gysVar.x);
        gkpVar.e(22, gysVar.y);
        String str = gysVar.z;
        if (str == null) {
            gkpVar.f(23);
        } else {
            gkpVar.g(23, str);
        }
        gsf gsfVar = gysVar.l;
        gkpVar.e(24, gvf.H(gsfVar.j));
        gkpVar.c(25, gvf.F(gsfVar.b));
        gkpVar.e(26, gsfVar.c ? 1L : 0L);
        gkpVar.e(27, gsfVar.d ? 1L : 0L);
        gkpVar.e(28, gsfVar.e ? 1L : 0L);
        gkpVar.e(29, gsfVar.f ? 1L : 0L);
        gkpVar.e(30, gsfVar.g);
        gkpVar.e(31, gsfVar.h);
        gkpVar.c(32, gvf.G(gsfVar.i));
    }

    @Override // defpackage.gil
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
