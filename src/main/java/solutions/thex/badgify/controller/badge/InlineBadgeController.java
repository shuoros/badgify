package solutions.thex.badgify.controller.badge;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutions.thex.badgify.log.ControllerLogger;
import solutions.thex.badgify.svg.responseWrapper.badge.inline.InlineLinkAsResponseWrapper;
import solutions.thex.badgify.svg.responseWrapper.badge.inline.InlineIconAsResponseWrapper;
import solutions.thex.badgify.svg.responseWrapper.badge.inline.InlineProfileAsResponseWrapper;
import solutions.thex.badgify.svg.responseWrapper.badge.inline.InlineTitleAsResponseWrapper;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Controller for the inline badge requests.
 *
 * @author Soroush Shemshadi
 * @version 1.2.0
 * @since 1.1.0
 */
@RestController
@RequestMapping("/api/badge/inline")
public class InlineBadgeController {

    private final ControllerLogger logger = new ControllerLogger(this.getClass());

    @GetMapping(path = "/link/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> inlineLinkBadge(HttpServletRequest request,//
                                                  @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("inlineLinkBadge", request, desing);

        return new InlineLinkAsResponseWrapper().wrap(desing);
    }

    @GetMapping(path = "/short/link/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> shortInlineLinkBadge(HttpServletRequest request,//
                                                       @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("shortInlineLinkBadge", request, desing);

        return new InlineLinkAsResponseWrapper().wrapShort(desing);
    }

    @GetMapping(path = "/icon/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> inlineIconBadge(HttpServletRequest request,//
                                                  @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("inlineIconBadge", request, desing);

        return new InlineIconAsResponseWrapper().wrap(desing);
    }

    @GetMapping(path = "/short/icon/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> shortInlineIconBadge(HttpServletRequest request,//
                                                       @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("shortInlineIconBadge", request, desing);

        return new InlineIconAsResponseWrapper().wrapShort(desing);
    }

    @GetMapping(path = "/title/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> inlineTitleBadge(HttpServletRequest request,//
                                                  @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("inlineTitleBadge", request, desing);

        return new InlineTitleAsResponseWrapper().wrap(desing);
    }

    @GetMapping(path = "/short/title/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> shortInlineTitleBadge(HttpServletRequest request,//
                                                       @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("shortInlineTitleBadge", request, desing);

        return new InlineTitleAsResponseWrapper().wrapShort(desing);
    }

    @GetMapping(path = "/profile/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> inlineProfileBadge(HttpServletRequest request,//
                                                   @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("inlineProfileBadge", request, desing);

        return new InlineProfileAsResponseWrapper().wrap(desing);
    }

    @GetMapping(path = "/short/profile/{design}", produces = "image/svg+xml")
    public ResponseEntity<String> shortInlineProfileBadge(HttpServletRequest request,//
                                                        @PathVariable(value = "design") String desing) throws IOException {
        logger.payloadLog("shortInlineProfileBadge", request, desing);

        return new InlineProfileAsResponseWrapper().wrapShort(desing);
    }

}
