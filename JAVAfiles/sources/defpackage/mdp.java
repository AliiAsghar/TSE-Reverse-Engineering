package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdp implements aiwo {
    private final /* synthetic */ int a;

    public /* synthetic */ mdp(int i) {
        this.a = i;
    }

    @Override // defpackage.aiwo
    public final apbt a(agrk agrkVar, apbt apbtVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                aozy builder = ((lzn) apbtVar).toBuilder();
                boolean B = agrkVar.B("camera_gallery_already_prompted_permissions", false);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                lzn lznVar = (lzn) builder.b;
                lznVar.b |= 2;
                lznVar.c = B;
                return (lzn) builder.s();
            }
            aozy builder2 = ((mdn) apbtVar).toBuilder();
            long C = agrkVar.C("last_passive_event_time_millis");
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            mdn mdnVar = (mdn) builder2.b;
            mdnVar.b |= 1;
            mdnVar.c = C;
            long C2 = agrkVar.C("logging_time_of_first_open");
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            mdn mdnVar2 = (mdn) builder2.b;
            mdnVar2.b |= 2;
            mdnVar2.d = C2;
            boolean B2 = agrkVar.B("should_send_first_week_messages_count", true);
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            mdn mdnVar3 = (mdn) builder2.b;
            mdnVar3.b |= 4;
            mdnVar3.e = B2;
            long C3 = agrkVar.C("last_active_event_time_millis");
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            mdn mdnVar4 = (mdn) builder2.b;
            mdnVar4.b |= 8;
            mdnVar4.f = C3;
            return (mdn) builder2.s();
        }
        aozy builder3 = ((mdn) apbtVar).toBuilder();
        long C4 = agrkVar.C("uploaded_at_last_report_bytes");
        if (!builder3.b.isMutable()) {
            builder3.u();
        }
        mdn mdnVar5 = (mdn) builder3.b;
        mdnVar5.b |= 16;
        mdnVar5.g = C4;
        long C5 = agrkVar.C("downloaded_at_last_report_bytes");
        if (!builder3.b.isMutable()) {
            builder3.u();
        }
        mdn mdnVar6 = (mdn) builder3.b;
        mdnVar6.b |= 32;
        mdnVar6.h = C5;
        long C6 = agrkVar.C("last_recurrent_analytics_upload_time_in_millis");
        if (!builder3.b.isMutable()) {
            builder3.u();
        }
        mdn mdnVar7 = (mdn) builder3.b;
        mdnVar7.b |= 64;
        mdnVar7.i = C6;
        long C7 = agrkVar.C("last_active_rcs_event_time_millis");
        if (!builder3.b.isMutable()) {
            builder3.u();
        }
        mdn mdnVar8 = (mdn) builder3.b;
        mdnVar8.b |= 128;
        mdnVar8.j = C7;
        return (mdn) builder3.s();
    }
}
