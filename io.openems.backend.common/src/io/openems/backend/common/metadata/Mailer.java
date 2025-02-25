package io.openems.backend.common.metadata;

import java.time.ZonedDateTime;

import org.osgi.annotation.versioning.ProviderType;

import com.google.gson.JsonElement;

@ProviderType
public interface Mailer {

	/**
	 * Send alerting mail at stamp to users.
	 *
	 * @param sendAt   time stamp at which the mail was sent
	 * @param template mail template to use
	 * @param params   mail data (e.g. recipients, subject, ...)
	 */
	public void sendMail(ZonedDateTime sendAt, String template, JsonElement params);

}
