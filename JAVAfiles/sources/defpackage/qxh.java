package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxh {
    public static final String a;
    public static final String b;
    public static final alog c;

    static {
        String[] strArr = sni.a;
        a = " (SELECT frecent_conversation_id, frecent_conversation_name, frecent_conversation_icon, frecent_conversation_type, frecent_participant_normalized_destination, frecent_has_rbm_bot_recipient, (strftime('%s','now') - received_timestamp/1000)/86400 AS message_age FROM (SELECT _id AS frecent_conversation_id, name AS frecent_conversation_name, icon AS frecent_conversation_icon, conv_type AS frecent_conversation_type, participant_normalized_destination AS frecent_participant_normalized_destination, has_ea2p_bot_recipient AS frecent_has_rbm_bot_recipient FROM conversations WHERE archive_status = 0 ORDER BY sort_timestamp DESC  LIMIT 10 )  LEFT JOIN messages ON (frecent_conversation_id=conversation_id) WHERE message_status < 100 AND (strftime('%s','now') - received_timestamp/1000)/86400 <= 15)";
        b = "CREATE VIEW conversation_frecency_view AS SELECT frecent_conversation_id, frecent_conversation_name, frecent_conversation_icon, frecent_conversation_type, frecent_participant_normalized_destination, frecent_has_rbm_bot_recipient, SUM(CASE WHEN message_age >= 0 AND message_age <= 1 THEN 1 WHEN message_age >  1 AND message_age <= 3 THEN 0.7 WHEN message_age > 3 AND message_age <= 7 THEN 0.5 WHEN message_age > 7 AND message_age <= 15 THEN 0.3 ELSE 0 END) AS frecency_score FROM  (SELECT frecent_conversation_id, frecent_conversation_name, frecent_conversation_icon, frecent_conversation_type, frecent_participant_normalized_destination, frecent_has_rbm_bot_recipient, (strftime('%s','now') - received_timestamp/1000)/86400 AS message_age FROM (SELECT _id AS frecent_conversation_id, name AS frecent_conversation_name, icon AS frecent_conversation_icon, conv_type AS frecent_conversation_type, participant_normalized_destination AS frecent_participant_normalized_destination, has_ea2p_bot_recipient AS frecent_has_rbm_bot_recipient FROM conversations WHERE archive_status = 0 ORDER BY sort_timestamp DESC  LIMIT 10 )  LEFT JOIN messages ON (frecent_conversation_id=conversation_id) WHERE message_status < 100 AND (strftime('%s','now') - received_timestamp/1000)/86400 <= 15) GROUP BY frecent_conversation_id ORDER BY frecency_score DESC LIMIT 5;";
        c = alog.x("frecent_conversation_id", "frecent_conversation_name", "frecent_conversation_icon", "frecency_score", "frecent_conversation_type", "frecent_participant_normalized_destination", "frecent_has_rbm_bot_recipient");
    }
}
